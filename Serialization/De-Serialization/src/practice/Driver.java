package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

    static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("E:/Java Backend/InterfaceSerializable/src_day41/practice/check.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dog = (Dog)ois.readObject();

        System.out.println(dog.name);
        System.out.println(dog.getSpecies());

        /*
        *  // here since the parent is not serialised but the childs super() const. will be called printing sout
        *
        * parent is not serialised so dog own constructor will be skipped
        * and thus dog.name will give the name as zerox but as species belong to parent and is not serialised so will
        * print unknown and not labrador.
        *
        * What deserialization does, step by step
          Read the descriptor and check the UID for Dog.
          Find the first non-serializable ancestor, which is Animal.
          Allocate the object and run Animal’s no-arg constructor on it. This prints Animal no-arg constructor and sets species to "unknown".
          Skip Dog’s own constructor, then fill in Dog’s fields from the stream (name = "Bruno").

Result:
* That is why its no-arg constructor must run on deserialization to initialize it.
         * */
    }
}
