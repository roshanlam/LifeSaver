package ai.api.android;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class GsonFactory {

    public static Gson getGson(){
        return ai.api.GsonFactory.getDefaultFactory().getGson();
    }

}
