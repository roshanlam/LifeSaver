package ai.api.android;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import java.util.TimeZone;
import ai.api.AIServiceContext;

/**
 * Do simple requests to the AI Service
 */
public class AIDataService extends ai.api.AIDataService {


    public static final String TAG = AIDataService.class.getName();

    @NonNull
    private final Context context;

    @NonNull
    private final AIConfiguration config;

    @NonNull
    private final Gson gson = GsonFactory.getGson();

    public AIDataService(@NonNull final Context context, @NonNull final AIConfiguration config) {
        super(config, new AIAndroidServiceContext(context));
        this.context = context;
        this.config = config;
    }

    private static class AIAndroidServiceContext implements AIServiceContext {

        private final String sessionId;

        public AIAndroidServiceContext(final Context context) {
            sessionId = SessionIdStorage.getSessionId(context);
        }

        public String getSessionId() {
            return sessionId;
        }

        public TimeZone getTimeZone() { return TimeZone.getDefault(); }
    }
}
