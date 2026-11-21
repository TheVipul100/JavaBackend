package whatsapp.read.message;
// for the driver class the package can be different but for deserialization of Message obj the package should be same

import whatsapp.message.Message;

import java.io.*;


// java 8
public class Driver {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("E:\\Java Backend/message.ser"); // std. code
        ObjectInputStream ois = new ObjectInputStream(fis); // reading the byte stream  and
        Message message = (Message) ois.readObject();  // converting to object // reading the file will give u obj. here u will get the msg obj


        System.out.println("De serialize: " + message.getMessage() + " and user id: "+ message.getUserId()); //as of now filepath problem
    }

    /*
    * purpose of serialversionUid
    * during de-serialization id, will be checked and that should match with the source and this keeps changing as we modify the code
    * so better to fix this id.
    *
    * */
    // getuserid will be null as it is transient imp. interview    **********************8
    // during serialization if we want to skip any sensitive data/field we declare it as transient


}// write obj. return data to file and now reading data will give object return to heap


/*
* readObject() will give the common "Object" parent class bcz serialize
*  gives common object bcz we can serialize or de-serialize any obj. it dont know that particular obj. need to be deserialized
* message//(so we downcaste to target)here Message obj.
* its generic somebody can deserialize an employee obj. then one can deserialize User obj. so generic
*
*
*
*Default deserializing for a class can be overridden using the writeObject and readObject methods.
* public final Object readObject()
        throws IOException, ClassNotFoundException {
        return readObject(Object.class);
*
*
*
* serialversionUId:
* Exception in thread "main" java.io.InvalidClassException: whatsapp.message.Message; local class incompatible:
* stream classdesc serialVersionUID = 4889032288661398812(during serialization), local class serialVersionUID = 1 (during de-serialization)
*  we have not fixed the uid in serialization so will throw this exception deserialization will fail to match both
* */