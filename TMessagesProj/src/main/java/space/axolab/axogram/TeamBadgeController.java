package space.axolab.axogram;

import android.os.AsyncTask;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import space.axolab.axogram.ui.web.HttpGetTask;

public class TeamBadgeController {

    private static final String TEAM_BADGE_URL = "https://account.axo-lab.space/data/team.json";
    private static final String PREF_TEAM_IDS = "axogram_team_badge_ids";
    private static final String PREF_TEAM_IDS_FETCH_TIME = "axogram_team_badge_fetch_time";
    private static final long REFRESH_INTERVAL_MS = 15L * 60L * 1000L;

    private static volatile TeamBadgeController instance;

    private final Object sync = new Object();
    private final HashSet<Long> teamIds = new HashSet<>();

    private boolean cacheLoaded;
    private boolean loading;

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
        refreshIfNeeded(false);
    }

    public boolean hasBadge(long userId) {
        if (userId <= 0) {
            return false;
        }
        ensureCacheLoaded();
        refreshIfNeeded(false);
        synchronized (sync) {
            return teamIds.contains(userId);
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
            teamIds.clear();
            Set<String> cachedIds = MessagesController.getGlobalMainSettings().getStringSet(PREF_TEAM_IDS, Collections.emptySet());
            if (cachedIds != null) {
                for (String rawId : cachedIds) {
                    if (TextUtils.isEmpty(rawId)) {
                        continue;
                    }
                    try {
                        teamIds.add(Long.parseLong(rawId));
                    } catch (Exception ignore) {
                    }
                }
            }
            cacheLoaded = true;
        }
    }

    private void refreshIfNeeded(boolean force) {
        long lastFetch = MessagesController.getGlobalMainSettings().getLong(PREF_TEAM_IDS_FETCH_TIME, 0);
        if (!force && System.currentTimeMillis() - lastFetch < REFRESH_INTERVAL_MS) {
            return;
        }
        synchronized (sync) {
            if (loading) {
                return;
            }
            loading = true;
        }
        new HttpGetTask(this::onResponse).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, TEAM_BADGE_URL);
    }

    private void onResponse(String response) {
        synchronized (sync) {
            loading = false;
        }
        if (TextUtils.isEmpty(response)) {
            return;
        }

        HashSet<Long> loadedIds = parseIds(response);
        if (loadedIds == null) {
            return;
        }

        synchronized (sync) {
            teamIds.clear();
            teamIds.addAll(loadedIds);
        }

        HashSet<String> idsToStore = new HashSet<>();
        for (Long id : loadedIds) {
            idsToStore.add(String.valueOf(id));
        }
        MessagesController.getGlobalMainSettings().edit()
            .putStringSet(PREF_TEAM_IDS, idsToStore)
            .putLong(PREF_TEAM_IDS_FETCH_TIME, System.currentTimeMillis())
            .apply();

        for (int account = 0; account < UserConfig.MAX_ACCOUNT_COUNT; account++) {
            NotificationCenter.getInstance(account).postNotificationName(
                NotificationCenter.updateInterfaces,
                MessagesController.UPDATE_MASK_NAME
            );
        }
    }

    private HashSet<Long> parseIds(String response) {
        try {
            response = response.trim();
            JSONArray idsArray;
            if (response.startsWith("[")) {
                idsArray = new JSONArray(response);
            } else {
                JSONObject object = new JSONObject(response);
                idsArray = object.optJSONArray("ids");
            }
            if (idsArray == null) {
                return null;
            }

            HashSet<Long> parsedIds = new HashSet<>();
            for (int i = 0; i < idsArray.length(); i++) {
                parsedIds.add(idsArray.getLong(i));
            }
            return parsedIds;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
