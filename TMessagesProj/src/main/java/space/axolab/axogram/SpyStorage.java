package space.axolab.axogram;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

import space.axolab.axogram.SQLite.SQLiteCursor;
import space.axolab.axogram.SQLite.SQLiteDatabase;
import space.axolab.axogram.SQLite.SQLitePreparedStatement;
import space.axolab.axogram.tgnet.NativeByteBuffer;
import space.axolab.axogram.tgnet.TLRPC;

public class SpyStorage {

    public static final String DATABASE_FILE_NAME = "save_base.axo";
    private static final boolean DEBUG_SPY_STORAGE = false;

    private static final int DB_VERSION = 1;
    private static final int TYPE_DELETED = 1;
    private static final int TYPE_EDIT = 2;

    private static final Object INSTANCES_LOCK = new Object();
    private static final SparseArray<SpyStorage> INSTANCES = new SparseArray<>();

    private final int currentAccount;
    private final Object dbLock = new Object();
    private final Object memoryLock = new Object();

    private SQLiteDatabase database;
    private File databaseFile;
    private File shmFile;
    private File walFile;
    private final LongSparseArray<SparseArray<MessageObject>> deletedMessagesMemoryCache = new LongSparseArray<>();
    private final LongSparseArray<SparseBooleanArray> deletedMessageIdsMemoryCache = new LongSparseArray<>();

    public static SpyStorage getInstance(int currentAccount) {
        synchronized (INSTANCES_LOCK) {
            SpyStorage instance = INSTANCES.get(currentAccount);
            if (instance == null) {
                instance = new SpyStorage(currentAccount);
                INSTANCES.put(currentAccount, instance);
            }
            return instance;
        }
    }

    private SpyStorage(int currentAccount) {
        this.currentAccount = currentAccount;
    }

    public void saveDeletedMessagesForUnknownDialogs(ArrayList<Integer> messageIds, boolean allowBotDialogs) {
        if (messageIds == null || messageIds.isEmpty()) {
            return;
        }
        runOnStorageQueue(() -> {
            try {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(currentAccount);
                SQLiteCursor cursor = null;
                SQLitePreparedStatement state = null;
                try {
                    cursor = messagesStorage.getDatabase().queryFinalized(
                            "SELECT uid, mid, date, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", messageIds) + ")");
                    ensureOpened();
                    database.beginTransaction();
                    state = database.executeFast("INSERT OR REPLACE INTO saved_messages VALUES(?, ?, ?, ?, ?, ?)");
                    while (cursor.next()) {
                        long dialogId = cursor.longValue(0);
                        if (!allowBotDialogs && isBotDialog(dialogId)) {
                            continue;
                        }
                        rememberDeletedMessageId(dialogId, cursor.intValue(1));
                        NativeByteBuffer data = cursor.byteBufferValue(3);
                        if (data == null) {
                            continue;
                        }
                        insertRecord(state, dialogId, cursor.intValue(1), TYPE_DELETED, cursor.intValue(2), 0, data);
                        data.reuse();
                    }
                    database.commitTransaction();
                } finally {
                    if (cursor != null) {
                        cursor.dispose();
                    }
                    if (state != null) {
                        state.dispose();
                    }
                    if (database != null) {
                        database.commitTransaction();
                    }
                }
            } catch (Throwable e) {
                FileLog.e(e);
            }
        });
    }

    public void saveDeletedMessagesForDialog(long dialogId, ArrayList<Integer> messageIds, boolean allowBotDialogs) {
        if (messageIds == null || messageIds.isEmpty()) {
            return;
        }
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return;
        }
        runOnStorageQueue(() -> {
            try {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(currentAccount);
                SQLiteCursor cursor = null;
                SQLitePreparedStatement state = null;
                try {
                    cursor = messagesStorage.getDatabase().queryFinalized(
                            "SELECT mid, date, data FROM messages_v2 WHERE uid = ? AND mid IN (" + TextUtils.join(",", messageIds) + ")",
                            dialogId
                    );
                    ArrayList<Integer> savedIds = new ArrayList<>();
                    ensureOpened();
                    database.beginTransaction();
                    state = database.executeFast("INSERT OR REPLACE INTO saved_messages VALUES(?, ?, ?, ?, ?, ?)");
                    while (cursor.next()) {
                        savedIds.add(cursor.intValue(0));
                        rememberDeletedMessageId(dialogId, cursor.intValue(0));
                        NativeByteBuffer data = cursor.byteBufferValue(2);
                        if (data == null) {
                            continue;
                        }
                        insertRecord(state, dialogId, cursor.intValue(0), TYPE_DELETED, cursor.intValue(1), 0, data);
                        data.reuse();
                    }
                    if (savedIds.size() < messageIds.size()) {
                        if (cursor != null) {
                            cursor.dispose();
                            cursor = null;
                        }
                        cursor = messagesStorage.getDatabase().queryFinalized(
                                "SELECT uid, mid, date, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", messageIds) + ")"
                        );
                        while (cursor.next()) {
                            int messageId = cursor.intValue(1);
                            if (savedIds.contains(messageId)) {
                                continue;
                            }
                            long actualDialogId = cursor.longValue(0);
                            rememberDeletedMessageId(dialogId, messageId);
                            rememberDeletedMessageId(actualDialogId, messageId);
                            NativeByteBuffer data = cursor.byteBufferValue(3);
                            if (data == null) {
                                continue;
                            }
                            insertRecord(state, dialogId, messageId, TYPE_DELETED, cursor.intValue(2), 0, data);
                            if (actualDialogId != dialogId) {
                                insertRecord(state, actualDialogId, messageId, TYPE_DELETED, cursor.intValue(2), 0, data);
                            }
                            data.reuse();
                        }
                    }
                    database.commitTransaction();
                } finally {
                    if (cursor != null) {
                        cursor.dispose();
                    }
                    if (state != null) {
                        state.dispose();
                    }
                    if (database != null) {
                        database.commitTransaction();
                    }
                }
            } catch (Throwable e) {
                FileLog.e(e);
            }
        });
    }

    public void savePreviousMessageVersion(long dialogId, int messageId, int editDate, boolean allowBotDialogs) {
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return;
        }
        runOnStorageQueue(() -> {
            try {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(currentAccount);
                SQLiteCursor cursor = null;
                SQLitePreparedStatement state = null;
                try {
                    cursor = messagesStorage.getDatabase().queryFinalized(
                            "SELECT date, data FROM messages_v2 WHERE uid = ? AND mid = ?",
                            dialogId, messageId
                    );
                    if (!cursor.next()) {
                        return;
                    }
                    NativeByteBuffer data = cursor.byteBufferValue(1);
                    if (data == null) {
                        return;
                    }
                    ensureOpened();
                    state = database.executeFast("INSERT OR REPLACE INTO saved_messages VALUES(?, ?, ?, ?, ?, ?)");
                    insertRecord(state, dialogId, messageId, TYPE_EDIT, cursor.intValue(0), editDate, data);
                    data.reuse();
                } finally {
                    if (cursor != null) {
                        cursor.dispose();
                    }
                    if (state != null) {
                        state.dispose();
                    }
                }
            } catch (Throwable e) {
                FileLog.e(e);
            }
        });
    }

    public void saveDeletedMessageSnapshot(long dialogId, MessageObject messageObject, boolean allowBotDialogs) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return;
        }
        rememberDeletedMessageId(dialogId, messageObject.getId());
        MessageObject cachedCopy = cloneMessageObject(messageObject);
        if (cachedCopy != null) {
            synchronized (memoryLock) {
                SparseArray<MessageObject> dialogCache = deletedMessagesMemoryCache.get(dialogId);
                if (dialogCache == null) {
                    dialogCache = new SparseArray<>();
                    deletedMessagesMemoryCache.put(dialogId, dialogCache);
                }
                dialogCache.put(cachedCopy.getId(), cachedCopy);
            }
        }
        runOnStorageQueue(() -> {
            SQLitePreparedStatement state = null;
            NativeByteBuffer data = null;
            try {
                synchronized (dbLock) {
                    ensureOpened();
                    data = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                    messageObject.messageOwner.serializeToStream(data);
                    state = database.executeFast("INSERT OR IGNORE INTO saved_messages VALUES(?, ?, ?, ?, ?, ?)");
                    insertRecord(state, dialogId, messageObject.getId(), TYPE_DELETED, messageObject.messageOwner.date, 0, data);
                    debugToast("SNAPSHOT saved mid=" + messageObject.getId() + " did=" + dialogId);
                }
            } catch (Throwable e) {
                FileLog.e(e);
                debugToast("SNAPSHOT error mid=" + messageObject.getId());
            } finally {
                if (state != null) {
                    state.dispose();
                }
                if (data != null) {
                    data.reuse();
                }
            }
        });
    }

    public File getDatabaseFile() {
        synchronized (dbLock) {
            ensureOpened();
            return databaseFile;
        }
    }

    public ArrayList<MessageObject> loadDeletedMessagesForDialog(long dialogId, boolean allowBotDialogs) {
        return loadDeletedMessagesForDialog(dialogId, Integer.MIN_VALUE, Integer.MAX_VALUE, allowBotDialogs);
    }

    public ArrayList<MessageObject> loadDeletedMessagesForDialog(long dialogId, int minMessageId, int maxMessageId, boolean allowBotDialogs) {
        ArrayList<MessageObject> result = new ArrayList<>();
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return result;
        }
        final int lowerBound = Math.min(minMessageId, maxMessageId);
        final int upperBound = Math.max(minMessageId, maxMessageId);
        synchronized (memoryLock) {
            SparseArray<MessageObject> memoryCache = deletedMessagesMemoryCache.get(dialogId);
            if (memoryCache != null) {
                for (int i = 0; i < memoryCache.size(); i++) {
                    MessageObject cachedMessage = cloneMessageObject(memoryCache.valueAt(i));
                    if (cachedMessage != null) {
                        int messageId = cachedMessage.getId();
                        if (messageId < lowerBound || messageId > upperBound) {
                            continue;
                        }
                        rememberDeletedMessageId(dialogId, cachedMessage.getId());
                        cachedMessage.deleted = true;
                        cachedMessage.forceUpdate = true;
                        result.add(cachedMessage);
                    }
                }
            }
        }
        runOnStorageQueue(() -> {
            SQLiteCursor cursor = null;
            try {
                synchronized (dbLock) {
                    ensureOpened();
                    cursor = database.queryFinalized(
                            "SELECT data FROM saved_messages WHERE dialog_id = ? AND saved_type = ? AND message_id >= ? AND message_id <= ? ORDER BY message_id DESC",
                            dialogId, TYPE_DELETED, lowerBound, upperBound
                    );
                    while (cursor.next()) {
                        NativeByteBuffer data = cursor.byteBufferValue(0);
                        if (data == null) {
                            continue;
                        }
                        try {
                            TLRPC.Message message = TLRPC.Message.TLdeserialize(data, data.readInt32(false), false);
                            if (message == null) {
                                continue;
                            }
                            message.readAttachPath(data, UserConfig.getInstance(currentAccount).clientUserId);
                            MessageObject messageObject = new MessageObject(currentAccount, message, false, false);
                            rememberDeletedMessageId(dialogId, messageObject.getId());
                            messageObject.deleted = true;
                            messageObject.forceUpdate = true;
                            boolean exists = false;
                            for (int i = 0; i < result.size(); i++) {
                                if (result.get(i).getId() == messageObject.getId()) {
                                    exists = true;
                                    break;
                                }
                            }
                            if (!exists) {
                                result.add(messageObject);
                            }
                        } catch (Throwable e) {
                            FileLog.e(e);
                        } finally {
                            data.reuse();
                        }
                    }
                }
            } catch (Throwable e) {
                FileLog.e(e);
                debugToast("LOAD error did=" + dialogId);
            } finally {
                if (cursor != null) {
                    cursor.dispose();
                }
            }
        });
        debugToast("LOAD did=" + dialogId + " count=" + result.size() + " range=" + lowerBound + ".." + upperBound);
        return result;
    }

    public void loadDeletedMessagesForDialogAsync(long dialogId, int minMessageId, int maxMessageId, boolean allowBotDialogs, Consumer<ArrayList<MessageObject>> callback) {
        runOnStorageQueueAsync(() -> loadDeletedMessagesForDialog(dialogId, minMessageId, maxMessageId, allowBotDialogs), callback);
    }

    public boolean hasEditHistoryForMessage(long dialogId, int messageId, boolean allowBotDialogs) {
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return false;
        }
        final boolean[] result = new boolean[1];
        runOnStorageQueue(() -> {
            SQLiteCursor cursor = null;
            try {
                synchronized (dbLock) {
                    ensureOpened();
                    cursor = database.queryFinalized(
                            "SELECT 1 FROM saved_messages WHERE dialog_id = ? AND message_id = ? AND saved_type = ? LIMIT 1",
                            dialogId, messageId, TYPE_EDIT
                    );
                    result[0] = cursor.next();
                }
            } catch (Throwable e) {
                FileLog.e(e);
            } finally {
                if (cursor != null) {
                    cursor.dispose();
                }
            }
        });
        return result[0];
    }

    public ArrayList<MessageObject> loadEditHistoryForMessage(long dialogId, int messageId, boolean allowBotDialogs) {
        ArrayList<MessageObject> result = new ArrayList<>();
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return result;
        }
        runOnStorageQueue(() -> {
            SQLiteCursor cursor = null;
            try {
                synchronized (dbLock) {
                    ensureOpened();
                    cursor = database.queryFinalized(
                            "SELECT data, edit_date FROM saved_messages WHERE dialog_id = ? AND message_id = ? AND saved_type = ? ORDER BY edit_date DESC",
                            dialogId, messageId, TYPE_EDIT
                    );
                    while (cursor.next()) {
                        NativeByteBuffer data = cursor.byteBufferValue(0);
                        if (data == null) {
                            continue;
                        }
                        int editDate = cursor.intValue(1);
                        try {
                            TLRPC.Message message = TLRPC.Message.TLdeserialize(data, data.readInt32(false), false);
                            if (message == null) {
                                continue;
                            }
                            message.readAttachPath(data, UserConfig.getInstance(currentAccount).clientUserId);
                            message.edit_date = editDate;
                            MessageObject messageObject = new MessageObject(currentAccount, message, false, false);
                            messageObject.forceUpdate = true;
                            result.add(messageObject);
                        } catch (Throwable e) {
                            FileLog.e(e);
                        } finally {
                            data.reuse();
                        }
                    }
                }
            } catch (Throwable e) {
                FileLog.e(e);
            } finally {
                if (cursor != null) {
                    cursor.dispose();
                }
            }
        });
        return result;
    }

    public File createExportFileCopy() {
        synchronized (dbLock) {
            ensureOpened();
            File exportFile = createTempFileCopy();
            return exportFile.exists() ? exportFile : null;
        }
    }

    public boolean exportToOutputStream(Uri targetUri) {
        if (targetUri == null) {
            return false;
        }
        synchronized (dbLock) {
            ensureOpened();
            File exportFile = createTempFileCopy();
            try (InputStream inputStream = new FileInputStream(exportFile);
                 OutputStream outputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(targetUri)) {
                if (outputStream == null) {
                    return false;
                }
                return AndroidUtilities.copyFile(inputStream, outputStream);
            } catch (Throwable e) {
                FileLog.e(e);
                return false;
            } finally {
                exportFile.delete();
            }
        }
    }

    public boolean importFromUri(Uri sourceUri) {
        if (sourceUri == null) {
            return false;
        }
        synchronized (dbLock) {
            closeInternal();
            try (InputStream inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(sourceUri)) {
                if (inputStream == null) {
                    return false;
                }
                prepareFiles();
                if (databaseFile.exists() && !databaseFile.delete()) {
                    return false;
                }
                if (walFile.exists()) {
                    walFile.delete();
                }
                if (shmFile.exists()) {
                    shmFile.delete();
                }
                AndroidUtilities.copyFile(inputStream, databaseFile);
                ensureOpened();
                return true;
            } catch (Throwable e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public boolean clearDatabase() {
        synchronized (memoryLock) {
            deletedMessagesMemoryCache.clear();
            deletedMessageIdsMemoryCache.clear();
        }
        synchronized (dbLock) {
            closeInternal();
            prepareFiles();
            boolean deleted = true;
            if (databaseFile.exists()) {
                deleted &= databaseFile.delete();
            }
            if (walFile.exists()) {
                deleted &= walFile.delete();
            }
            if (shmFile.exists()) {
                deleted &= shmFile.delete();
            }
            if (deleted) {
                ensureOpened();
            }
            return deleted;
        }
    }

    void saveDeletedMessagesForDialogDirect(SQLiteDatabase sourceDatabase, long dialogId, ArrayList<Integer> messageIds, boolean allowBotDialogs) {
        if (sourceDatabase == null || messageIds == null || messageIds.isEmpty()) {
            return;
        }
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return;
        }
        SQLiteCursor cursor = null;
        SQLitePreparedStatement state = null;
        try {
            cursor = sourceDatabase.queryFinalized(
                    "SELECT mid, date, data FROM messages_v2 WHERE uid = ? AND mid IN (" + TextUtils.join(",", messageIds) + ")",
                    dialogId
            );
            synchronized (dbLock) {
                ensureOpened();
                database.beginTransaction();
                state = database.executeFast("INSERT OR REPLACE INTO saved_messages VALUES(?, ?, ?, ?, ?, ?)");
                ArrayList<Integer> savedIds = new ArrayList<>();
                while (cursor.next()) {
                    savedIds.add(cursor.intValue(0));
                    rememberDeletedMessageId(dialogId, cursor.intValue(0));
                    NativeByteBuffer data = cursor.byteBufferValue(2);
                    if (data == null) {
                        continue;
                    }
                    insertRecord(state, dialogId, cursor.intValue(0), TYPE_DELETED, cursor.intValue(1), 0, data);
                    data.reuse();
                }
                if (savedIds.size() < messageIds.size()) {
                    if (cursor != null) {
                        cursor.dispose();
                        cursor = null;
                    }
                    cursor = sourceDatabase.queryFinalized(
                            "SELECT uid, mid, date, data FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", messageIds) + ")"
                    );
                    while (cursor.next()) {
                        int messageId = cursor.intValue(1);
                        if (savedIds.contains(messageId)) {
                            continue;
                        }
                        long actualDialogId = cursor.longValue(0);
                        rememberDeletedMessageId(dialogId, messageId);
                        rememberDeletedMessageId(actualDialogId, messageId);
                        NativeByteBuffer data = cursor.byteBufferValue(3);
                        if (data == null) {
                            continue;
                        }
                        insertRecord(state, dialogId, messageId, TYPE_DELETED, cursor.intValue(2), 0, data);
                        if (actualDialogId != dialogId) {
                            insertRecord(state, actualDialogId, messageId, TYPE_DELETED, cursor.intValue(2), 0, data);
                        }
                        data.reuse();
                    }
                }
                database.commitTransaction();
                debugToast("DIRECT saved did=" + dialogId + " mids=" + savedIds.size() + "/" + messageIds.size());
            }
        } catch (Throwable e) {
            FileLog.e(e);
            debugToast("DIRECT error did=" + dialogId);
        } finally {
            if (cursor != null) {
                cursor.dispose();
            }
            if (state != null) {
                state.dispose();
            }
            synchronized (dbLock) {
                if (database != null) {
                    database.commitTransaction();
                }
            }
        }
    }

    private void debugToast(String text) {
        if (!DEBUG_SPY_STORAGE) {
            return;
        }
        AndroidUtilities.runOnUIThread(() -> {
            try {
                Toast.makeText(ApplicationLoader.applicationContext, "SPY: " + text, Toast.LENGTH_SHORT).show();
            } catch (Throwable ignore) {
            }
        });
    }

    private File createTempFileCopy() {
        prepareFiles();
        File exportFile = new File(databaseFile.getParentFile(), "export_" + DATABASE_FILE_NAME);
        try {
            AndroidUtilities.copyFile(databaseFile, exportFile);
        } catch (Throwable e) {
            FileLog.e(e);
        }
        return exportFile;
    }

    private void insertRecord(SQLitePreparedStatement state, long dialogId, int messageId, int type, int messageDate, int editDate, NativeByteBuffer data) throws Exception {
        state.requery();
        state.bindLong(1, dialogId);
        state.bindInteger(2, messageId);
        state.bindInteger(3, type);
        state.bindInteger(4, messageDate);
        state.bindInteger(5, editDate);
        data.rewind();
        state.bindByteBuffer(6, data);
        state.step();
    }

    private MessageObject cloneMessageObject(MessageObject source) {
        if (source == null || source.messageOwner == null) {
            return null;
        }
        NativeByteBuffer data = null;
        try {
            data = new NativeByteBuffer(source.messageOwner.getObjectSize());
            source.messageOwner.serializeToStream(data);
            data.rewind();
            TLRPC.Message message = TLRPC.Message.TLdeserialize(data, data.readInt32(false), false);
            if (message == null) {
                return null;
            }
            message.readAttachPath(data, UserConfig.getInstance(currentAccount).clientUserId);
            MessageObject messageObject = new MessageObject(currentAccount, message, false, false);
            messageObject.deleted = true;
            messageObject.forceUpdate = true;
            return messageObject;
        } catch (Throwable e) {
            FileLog.e(e);
            return null;
        } finally {
            if (data != null) {
                data.reuse();
            }
        }
    }

    private boolean isBotDialog(long dialogId) {
        if (dialogId <= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(currentAccount).getUser(dialogId);
        return user != null && user.bot;
    }

    public boolean isMessageMarkedDeleted(long dialogId, int messageId, boolean allowBotDialogs) {
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return false;
        }
        synchronized (memoryLock) {
            SparseBooleanArray dialogCache = deletedMessageIdsMemoryCache.get(dialogId);
            if (dialogCache != null && dialogCache.get(messageId)) {
                return true;
            }
        }
        final boolean[] result = new boolean[1];
        runOnStorageQueue(() -> {
            SQLiteCursor cursor = null;
            try {
                synchronized (dbLock) {
                    ensureOpened();
                    cursor = database.queryFinalized(
                            "SELECT 1 FROM saved_messages WHERE dialog_id = ? AND message_id = ? AND saved_type = ? LIMIT 1",
                            dialogId, messageId, TYPE_DELETED
                    );
                    result[0] = cursor.next();
                }
            } catch (Throwable e) {
                FileLog.e(e);
            } finally {
                if (cursor != null) {
                    cursor.dispose();
                }
            }
        });
        if (result[0]) {
            rememberDeletedMessageId(dialogId, messageId);
        }
        return result[0];
    }

    public boolean isMessageMarkedDeletedCached(long dialogId, int messageId, boolean allowBotDialogs) {
        if (!allowBotDialogs && isBotDialog(dialogId)) {
            return false;
        }
        synchronized (memoryLock) {
            SparseBooleanArray dialogCache = deletedMessageIdsMemoryCache.get(dialogId);
            return dialogCache != null && dialogCache.get(messageId);
        }
    }

    private void rememberDeletedMessageId(long dialogId, int messageId) {
        synchronized (memoryLock) {
            SparseBooleanArray dialogCache = deletedMessageIdsMemoryCache.get(dialogId);
            if (dialogCache == null) {
                dialogCache = new SparseBooleanArray();
                deletedMessageIdsMemoryCache.put(dialogId, dialogCache);
            }
            dialogCache.put(messageId, true);
        }
    }

    private void ensureOpened() {
        synchronized (dbLock) {
            if (database != null) {
                return;
            }
            prepareFiles();
            boolean createSchema = !databaseFile.exists();
            try {
                database = new SQLiteDatabase(databaseFile.getPath());
                database.executeFast("PRAGMA journal_mode = DELETE").stepThis().dispose();
                database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                database.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                if (createSchema || !database.tableExists("saved_messages")) {
                    database.executeFast("CREATE TABLE IF NOT EXISTS saved_messages(dialog_id INTEGER, message_id INTEGER, saved_type INTEGER, message_date INTEGER, edit_date INTEGER, data BLOB, PRIMARY KEY(dialog_id, message_id, saved_type, edit_date));").stepThis().dispose();
                    database.executeFast("CREATE INDEX IF NOT EXISTS saved_messages_type_idx ON saved_messages(saved_type, dialog_id, message_id);").stepThis().dispose();
                    database.executeFast("PRAGMA user_version = " + DB_VERSION).stepThis().dispose();
                }
            } catch (Throwable e) {
                FileLog.e(e);
                closeInternal();
            }
        }
    }

    private void closeInternal() {
        if (database != null) {
            database.close();
            database = null;
        }
    }

    private void prepareFiles() {
        File filesDir = ApplicationLoader.getFilesDirFixed();
        if (currentAccount != 0) {
            filesDir = new File(filesDir, "account" + currentAccount + "/");
            filesDir.mkdirs();
        }
        databaseFile = new File(filesDir, DATABASE_FILE_NAME);
        walFile = new File(filesDir, DATABASE_FILE_NAME + "-wal");
        shmFile = new File(filesDir, DATABASE_FILE_NAME + "-shm");
    }

    private void runOnStorageQueue(Runnable runnable) {
        CountDownLatch latch = new CountDownLatch(1);
        MessagesStorage.getInstance(currentAccount).getStorageQueue().postRunnable(() -> {
            try {
                runnable.run();
            } finally {
                latch.countDown();
            }
        });
        try {
            latch.await();
        } catch (Throwable e) {
            FileLog.e(e);
        }
    }

    private <T> void runOnStorageQueueAsync(SupplierWithException<T> supplier, Consumer<T> callback) {
        MessagesStorage.getInstance(currentAccount).getStorageQueue().postRunnable(() -> {
            T result = null;
            try {
                result = supplier.get();
            } catch (Throwable e) {
                FileLog.e(e);
            }
            final T finalResult = result;
            if (callback != null) {
                AndroidUtilities.runOnUIThread(() -> callback.accept(finalResult));
            }
        });
    }

    private interface SupplierWithException<T> {
        T get() throws Exception;
    }
}
