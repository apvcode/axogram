package space.axolab.axogram;

import android.os.AsyncTask;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import space.axolab.axogram.tgnet.TLRPC;
import space.axolab.axogram.ui.web.HttpPostTask;

public class TeamBadgeController {

    private static final String TEAM_BADGE_URL = "https://account.axo-lab.space/mobile-api/team_badge_check.php";
    private static final String PREF_BADGED_IDS = "axogram_badged_ids";
    private static final String PREF_CHECKED_IDS = "axogram_badge_checked_ids";
    private static final String PREF_SESSION_SIGNATURE = "axogram_badge_session_signature";
    private static final long REQUEST_DEBOUNCE_MS = 180L;

    private static volatile TeamBadgeController instance;

    private final Object sync = new Object();
    private final HashSet<Long> badgedIds = new HashSet<>();
    private final HashSet<Long> checkedIds = new HashSet<>();
    private final HashSet<Long> pendingIds = new HashSet<>();

    private boolean cacheLoaded;
    private boolean loading;
    private boolean requestScheduled;

    private final Runnable requestRunnable = this::requestPendingIds;

    public static TeamBadgeController getInstance() {
        TeamBadgeController localInstance = instance;
        if (localInstance == null) {
            synchronized (TeamBadgeController.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new TeamBadgeController();
                }
            }
        }
        return localInstance;
    }

    private TeamBadgeController() {
    }

    public void preload() {
        ensureCacheLoaded();
        refreshSessionCacheIfNeeded();
    }

    public boolean hasBadge(long userId) {
        if (userId <= 0) {
            return false;
        }
        ensureCacheLoaded();
        synchronized (sync) {
            if (badgedIds.contains(userId)) {
                return true;
            }
            if (!checkedIds.contains(userId)) {
                pendingIds.add(userId);
                scheduleRequestLocked();
            }
            return false;
        }
    }

    private void ensureCacheLoaded() {
        if (cacheLoaded) {
            return;
        }
        synchronized (sync) {
            if (cacheLoaded) {
                return;
            }
            restoreIds(MessagesController.getGlobalMainSettings().getStringSet(PREF_BADGED_IDS, Collections.emptySet()), badgedIds);
            restoreIds(MessagesController.getGlobalMainSettings().getStringSet(PREF_CHECKED_IDS, Collections.emptySet()), checkedIds);
            cacheLoaded = true;
        }
    }

    private void refreshSessionCacheIfNeeded() {
        String currentSignature = buildSessionSignature();
        String savedSignature = MessagesController.getGlobalMainSettings().getString(PREF_SESSION_SIGNATURE, "");
        if (TextUtils.equals(currentSignature, savedSignature)) {
            return;
        }
        synchronized (sync) {
            badgedIds.clear();
            checkedIds.clear();
            pendingIds.clear();
            loading = false;
            requestScheduled = false;
        }
        AndroidUtilities.cancelRunOnUIThread(requestRunnable);
        MessagesController.getGlobalMainSettings().edit()
            .putStringSet(PREF_BADGED_IDS, Collections.emptySet())
            .putStringSet(PREF_CHECKED_IDS, Collections.emptySet())
            .putString(PREF_SESSION_SIGNATURE, currentSignature)
            .apply();
        notifyUi();
    }

    private String buildSessionSignature() {
        StringBuilder builder = new StringBuilder();
        for (int account = 0; account < UserConfig.MAX_ACCOUNT_COUNT; account++) {
            UserConfig userConfig = UserConfig.getInstance(account);
            if (!userConfig.isClientActivated()) {
                continue;
            }
            TLRPC.User user = userConfig.getCurrentUser();
            builder.append(account)
                .append(':')
                .append(user != null ? user.id : 0L)
                .append(':')
                .append(userConfig.loginTime)
                .append(';');
        }
        return builder.toString();
    }

    private void restoreIds(Set<String> storedIds, HashSet<Long> target) {
        target.clear();
        if (storedIds == null) {
            return;
        }
        for (String rawId : storedIds) {
            if (TextUtils.isEmpty(rawId)) {
                continue;
            }
            try {
                target.add(Long.parseLong(rawId));
            } catch (Exception ignore) {
            }
        }
    }

    private void scheduleRequestLocked() {
        if (requestScheduled) {
            return;
        }
        requestScheduled = true;
        AndroidUtilities.cancelRunOnUIThread(requestRunnable);
        AndroidUtilities.runOnUIThread(requestRunnable, REQUEST_DEBOUNCE_MS);
    }

    private void requestPendingIds() {
        final ArrayList<Long> idsToRequest;
        synchronized (sync) {
            requestScheduled = false;
            if (loading || pendingIds.isEmpty()) {
                return;
            }
            loading = true;
            idsToRequest = new ArrayList<>(pendingIds);
            pendingIds.clear();
        }

        JSONArray idsArray = new JSONArray();
        for (Long id : idsToRequest) {
            idsArray.put(id);
        }
        JSONObject body = new JSONObject();
        try {
            body.put("ids", idsArray);
        } catch (Exception e) {
            synchronized (sync) {
                loading = false;
                pendingIds.addAll(idsToRequest);
            }
            return;
        }

        new HttpPostTask("application/json; charset=utf-8", body.toString(), response -> onResponse(idsToRequest, response))
            .setHeader("X-AxoGram-Client", "android")
            .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, TEAM_BADGE_URL);
    }

    private void onResponse(ArrayList<Long> requestedIds, String response) {
        synchronized (sync) {
            loading = false;
        }
        if (TextUtils.isEmpty(response)) {
            synchronized (sync) {
                pendingIds.addAll(requestedIds);
                scheduleRequestLocked();
            }
            return;
        }

        try {
            JSONObject object = new JSONObject(response.trim());
            JSONObject badges = object.optJSONObject("badges");
            if (!object.optBoolean("ok") || badges == null) {
                synchronized (sync) {
                    pendingIds.addAll(requestedIds);
                    scheduleRequestLocked();
                }
                return;
            }

            HashSet<Long> responseBadged = new HashSet<>();
            Iterator<String> keys = badges.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                if (badges.optBoolean(key, false)) {
                    responseBadged.add(Long.parseLong(key));
                }
            }

            synchronized (sync) {
                checkedIds.addAll(requestedIds);
                badgedIds.removeAll(requestedIds);
                badgedIds.addAll(responseBadged);
            }
            saveCache();
            notifyUi();
        } catch (Exception e) {
            FileLog.e(e);
            synchronized (sync) {
                pendingIds.addAll(requestedIds);
                scheduleRequestLocked();
            }
        }
    }

    private void saveCache() {
        HashSet<String> badged = new HashSet<>();
        HashSet<String> checked = new HashSet<>();
        synchronized (sync) {
            for (Long id : badgedIds) {
                badged.add(String.valueOf(id));
            }
            for (Long id : checkedIds) {
                checked.add(String.valueOf(id));
            }
        }
        MessagesController.getGlobalMainSettings().edit()
            .putStringSet(PREF_BADGED_IDS, badged)
            .putStringSet(PREF_CHECKED_IDS, checked)
            .apply();
    }

    private void notifyUi() {
        for (int account = 0; account < UserConfig.MAX_ACCOUNT_COUNT; account++) {
            NotificationCenter.getInstance(account).postNotificationName(
                NotificationCenter.updateInterfaces,
                MessagesController.UPDATE_MASK_ALL
            );
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.reloadInterface);
    }
}
