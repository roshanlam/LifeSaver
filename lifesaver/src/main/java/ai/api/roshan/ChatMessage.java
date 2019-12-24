package ai.api.roshan;

public class ChatMessage {
    public boolean rightSide;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String message;

    public ChatMessage() {
        super();
    }

    public ChatMessage(boolean rightSide, String message) {
        super();
        this.rightSide = rightSide;
        this.message = message;
    }

    public ChatMessage(String message) {
        super();
        this.message = message;
    }
}
