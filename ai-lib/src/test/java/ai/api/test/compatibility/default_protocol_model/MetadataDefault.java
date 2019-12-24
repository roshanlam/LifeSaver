package ai.api.test.compatibility.default_protocol_model;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MetadataDefault implements Serializable {

    /**
     * Name of the intent that produced this result
     */
    @SerializedName("intentName")
    private String intentName;

    /**
     * Id of the intent that produced this result
     */
    @SerializedName("intentId")
    private String intentId;

    /**
     * Currently active contexts
     */
    @SerializedName("contexts")
    private String[] contexts;

    /**
     * Name of the intent that produced this result
     */
    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(final String intentName) {
        this.intentName = intentName;
    }

    /**
     * Id of the intent that produced this result
     */
    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(final String intentId) {
        this.intentId = intentId;
    }

    public String[] getContexts() {
        return contexts;
    }
}
