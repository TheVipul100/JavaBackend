package whatsapp.message;

import java.io.Serial;
import java.io.Serializable;

public class Message implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L; // serial version is a unique id given by JVM to the class used
    // during deserialization whenever modified the class u need to change this id

    // if modified the class everytime jvm gives a unique number to this  lets say msg changed then uniqueid will change
    // so it should be same

    String message;
    String messageId;
    private transient String userId;

    public Message(String message, String messageId , String userId) {
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


/*
* while de-serializing the package name usually and class name must be exactly same
* no mistake
*
*
* create a driver class and then
*
* object that is written in the message.ser (right now is in bytestream )will be reading and deserializing it
*
* de-serialising means need to read the object i.e read the file just opposite process
* */