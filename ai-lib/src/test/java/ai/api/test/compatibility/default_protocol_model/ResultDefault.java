package ai.api.test.compatibility.default_protocol_model;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;

public class ResultDefault implements Serializable {

    @SerializedName("speech")
    private String speech;

    @SerializedName("action")
    private String action;

    /**
     * This field will be deserialized as hashMap container with all parameters and it's values
     */
    @SerializedName("parameters")
    private HashMap<String, JsonElement> parameters;

    @SerializedName("metadata")
    private MetadataDefault metadata;

    /**
     * The query that was used to produce this result
     */
    @SerializedName("resolvedQuery")
    private String resolvedQuery;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(final String speech) {
        this.speech = speech;
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public MetadataDefault getMetadata() {
        return metadata;
    }

    public void setMetadata(final MetadataDefault metadata) {
        this.metadata = metadata;
    }

    public HashMap<String, JsonElement> getParameters() {
        return parameters;
    }

    /**
     * The query that was used to produce this result
     */
    public String getResolvedQuery() {
        return resolvedQuery;
    }

    public void setResolvedQuery(final String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    @Override
    public String toString() {
        return String.format("Result {speech='%s', action='%s', resolvedQuery='%s'}",
                speech,
                action,
                resolvedQuery);
    }
}
