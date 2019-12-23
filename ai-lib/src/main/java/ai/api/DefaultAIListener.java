package ai.api;
/**
 * Use this class instead of AIListener if you don't want to process all recognition events. Only onResult and onError required.
 */
public abstract class DefaultAIListener implements AIListener {

    @Override
    public void onAudioLevel(final float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningFinished() {

    }
}
