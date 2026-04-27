package space.axolab.axogram;

import space.axolab.axogram.tgnet.TLRPC;

public final class AxoGramVerifiedChannels {

    // Telegram full ids:
    // -1003237059316
    // -1003884412167
    private static final long CHANNEL_RELEASES_ID = 3237059316L;
    private static final long CHANNEL_NEWS_ID = 3884412167L;

    private AxoGramVerifiedChannels() {
    }

    public static boolean isVerified(long chatId) {
        return chatId == CHANNEL_RELEASES_ID || chatId == CHANNEL_NEWS_ID;
    }

    public static boolean isVerified(TLRPC.Chat chat) {
        return chat != null && isVerified(chat.id);
    }

    public static boolean isVerifiedChat(TLRPC.Chat chat) {
        return chat != null && (chat.verified || isVerified(chat.id));
    }
}
