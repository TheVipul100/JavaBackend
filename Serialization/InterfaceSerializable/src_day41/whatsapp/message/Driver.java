package whatsapp.message;

import java.io.IOException;

public class Driver {

    static void main(String[] args) throws IOException {


        // going to serialize the object of Message class that means converting the code or msg to byte stream
        MessageSerialization messageSerialization = new MessageSerialization();

        Message message = new Message("kyaa heeee kr rhe hoooooo","MSG!","123456");

        messageSerialization.serializeMsg(message);
    }
}


/*
*  interview
*  what is not serializable exception in depth -- when the owner of the class has not allowed its object to get
*  serialised and u r trying to serialise the object then it throws
*  don't answer in short one word or something needs explanation
* */