package eCommerceSerialized;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OrderSerialize {

    public void serializeOrder(OrderItem orderItem,Order order,Address address) throws IOException {


        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Java Backend\\InterfaceSerializable\\orderLelo.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(orderItem);
        objectOutputStream.writeObject(order);
        objectOutputStream.writeObject(address);

        objectOutputStream.close();
    }
}
