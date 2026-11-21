package whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable //Externalizable
    //With Externalizable you write and read every field yourself.
        // During deserialization the public no-arg constructor is called first, then readExternal fills in the state.
{

    private static final long serialVersionUID = 1L;
    private String message;
    private String messageId;
    private transient String userId;// sensitive data that we dont want to write in file declare this as a transient -->
    // sensitive data which we dont want to serialize dont want to send over the n/w we can mark it as transient
    // now this will not be sent will not be written in byte-stream will be skipped

    public Message(String message, String messageId, String userId) {
        this.message = message;
        this.messageId = messageId;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
