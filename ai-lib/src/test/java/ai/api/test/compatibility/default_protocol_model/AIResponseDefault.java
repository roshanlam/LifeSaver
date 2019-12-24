package ai.api.test.compatibility.default_protocol_model;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import ai.api.model.Status;

public class AIResponseDefault implements Serializable {

    /**
     * Unique identifier of the result.
     */
    @SerializedName("id")
    private String id;

    @SerializedName("timestamp")
    private Date timestamp;

    /**
     * Result object
     */
    @SerializedName("result")
    private ResultDefault result;

    @SerializedName("status")
    private Status status;

    /**
     * Unique identifier of the result.
     */
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Result object
     */
    public ResultDefault getResult() {
        return result;
    }

    public void setResult(final ResultDefault result) {
        this.result = result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public boolean isError() {
        if (status != null && status.getCode() != null && status.getCode() >= 400) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("AIResponse{id='%s', timestamp=%s, result=%s, status=%s}",
                id,
                timestamp,
                result,
                status);
    }
}
