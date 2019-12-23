package ai.api.android;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import java.net.Proxy;

public class AIConfiguration extends ai.api.AIConfiguration {
    public enum RecognitionEngine {

        /**
         * Google Speech Recognition integrated into Android OS
         *
         * @deprecated Use System instead
         */
        @Deprecated
        Google,

        /**
         * Default system recognition
         */
        System,

        @Deprecated
        Speaktoit
    }

    private final RecognitionEngine recognitionEngine;

    /**
     * Speaktoit recognition start sound resouce descriptor
     */
    private AssetFileDescriptor recognizerStartSound;

    /**
     * Speaktoit recognition stop sound resouce descriptor
     */
    private AssetFileDescriptor recognizerStopSound;

    /**
     * Speaktoit recognition cancel sound resource descriptor
     */
    private AssetFileDescriptor recognizerCancelSound;

    private boolean voiceActivityDetectionEnabled = true;

    private boolean normalizeInputSound = false;

    public AIConfiguration(final String clientAccessToken, final SupportedLanguages language, final RecognitionEngine recognitionEngine) {
        super(clientAccessToken, language);

        this.recognitionEngine = recognitionEngine;

        if (recognitionEngine == RecognitionEngine.Speaktoit
                && language == SupportedLanguages.Korean) {
            throw new UnsupportedOperationException("Only System recognition supported for Korean language");
        }
    }

    public RecognitionEngine getRecognitionEngine() {
        return recognitionEngine;
    }

    public boolean isVoiceActivityDetectionEnabled() {
        return voiceActivityDetectionEnabled;
    }

    /**
     * With setting this field to false you can disable voice activity detection for Speaktoit recognition.
     * This option does not affect System recognition.
     * @param voiceActivityDetectionEnabled
     */
    public void setVoiceActivityDetectionEnabled(final boolean voiceActivityDetectionEnabled) {
        this.voiceActivityDetectionEnabled = voiceActivityDetectionEnabled;
    }

    /**
     * With setting this field to true you can enable sound amplification if it's too quiet. This option improves recognition quality on some devices.
     * This option does not affect System recognition.
     * @param normalizeInputSound
     */
    public void setNormalizeInputSound(final boolean normalizeInputSound) {
        this.normalizeInputSound = normalizeInputSound;
    }

    public boolean isNormalizeInputSound() {
        return normalizeInputSound;
    }

    public AssetFileDescriptor getRecognizerStartSound() {
        return recognizerStartSound;
    }

    public void setRecognizerStartSound(final AssetFileDescriptor recognizerStartSound) {
        this.recognizerStartSound = recognizerStartSound;
    }

    public AssetFileDescriptor getRecognizerStopSound() {
        return recognizerStopSound;
    }

    public void setRecognizerStopSound(final AssetFileDescriptor recognizerStopSound) {
        this.recognizerStopSound = recognizerStopSound;
    }

    public AssetFileDescriptor getRecognizerCancelSound() {
        return recognizerCancelSound;
    }

    public void setRecognizerCancelSound(final AssetFileDescriptor recognizerCancelSound) {
        this.recognizerCancelSound = recognizerCancelSound;
    }
}
