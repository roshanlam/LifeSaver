package ai.api.android;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

public abstract class SessionIdStorage {
    private static final String PREF_NAME = "APIAI_preferences";
    private static final String SESSION_ID = "sessionId";

    public synchronized static String getSessionId(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        final String sessionId = sharedPreferences.getString(SESSION_ID, "");
        if (!TextUtils.isEmpty(sessionId)) {
            return sessionId;
        } else {
            final SharedPreferences.Editor editor = sharedPreferences.edit();
            final String value = UUID.randomUUID().toString();
            editor.putString(SESSION_ID, value);
            editor.commit();
            return value;
        }

    }

    public static synchronized void resetSessionId(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SESSION_ID, "");
        editor.commit();
    }
}
