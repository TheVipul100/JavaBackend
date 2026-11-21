package whatsapp.message;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization {

    public void serializeMsg(Message message) throws IOException {

        FileOutputStream fio = new FileOutputStream("message.ser");  // load from disk and open the file so that u can write the object (in the disk msg.ser  send your data outside so u will convert the obj. into bytestream)
        ObjectOutputStream oos = new ObjectOutputStream(fio);  // writing  -- data converting into bytestream
        oos.writeObject(message); // creates connection with the file message.ser so passing data to go over the n/w for reading i/p
        //access

        oos.close(); // close the connection
    }


}


// extension.txt    or serialization ---->>> .ser

/*
*
* Standard operations :
*1-- create a Fileoutput stream
*2-- create a Objectoutput stream
*3-- write message
*
* to create a file we will write the object, that object is Message message
*
* the generated "message.ser" will be in byte stream that is not human readable
* and now this file will be sent over the network,stored in db,
*
* now lets say 100 obj in chat appli. u want to send how will you send obviously serialisation in required
* so 100 obj will be serialise with its state
*
* lets say hi on whatsapp  and your friend is in us how that will be sent it is an object so without converting it
* into byte stream how is it possible so after conversion that will be de serialized at us friend destination and then
* he will be able to read it
*
* object exist in heap if taken out then it is deleted so to send it we serialise it we convert it into byte stream and
* then send it (any java object can be serialised) only important thing is permission to the class
*  ie.;
* implements Serializable owner of the class must give permission
*
*
*
* ************************
*
* message.ser is in byte stream so now that can be de-serialised and u can get the object again from
* message.serialisation file(reading the msd.ser) in their JVM transferring from one jVM to another JVM
*
* basically information as the state of obj
*
*
*
* */

