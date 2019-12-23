package ai.api;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIResponse;

/**
 * Listener interface for working with API.AI service. Create implementation of it and use with {@link AIService AIService}
 */
public interface AIListener {

    /**
     * Event fires when entire process finished successfully, and returns result object
     *
     * @param result the result object, contains server answer
     */
    void onResult(AIResponse result);

    /**
     * Event fires if something going wrong while recognition or access to the AI server
     *
     * @param error the error description object
     */
    void onError(AIError error);

    /**
     * Event fires every time sound level changed. Use it to create visual feedback. There is no guarantee that this method will
     * be called.
     *
     * @param level the new RMS dB value
     */
    void onAudioLevel(float level);

    /**
     * Event fires when recognition engine start listening
     */
    void onListeningStarted();

    /**
     * Event fires when recognition engine cancel listening
     */
    void onListeningCanceled();

    /**
     * Event fires when recognition engine finish listening
     */
    void onListeningFinished();
}
