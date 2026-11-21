package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
    static void main(String[] args) throws IOException {
        Dog dog = new Dog("zerox","Labrador");

        FileOutputStream fis = new FileOutputStream("E:/Java Backend/InterfaceSerializable/src_day41/practice/check.ser");
        ObjectOutputStream obj = new ObjectOutputStream((fis));
        obj.writeObject(dog);
        obj.close();
    }

}
