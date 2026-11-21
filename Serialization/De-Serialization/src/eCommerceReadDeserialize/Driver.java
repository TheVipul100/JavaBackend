package eCommerceReadDeserialize;

import eCommerceSerialized.Address;
import eCommerceSerialized.Order;
import eCommerceSerialized.OrderItem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

    static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("E:\\Java Backend\\InterfaceSerializable/orderLelo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        OrderItem orderItem = (OrderItem) ois.readObject();
        Order order = (Order) ois.readObject();

        Address address = (Address) ois.readObject();

        System.out.println("De-serializing the incoming object: ......" + "\n" + order.toString() + "\n" + orderItem.toString() + "\n"
                + address.toString());
    }

}

/*
*
* Bug 2: Read order doesn’t match write order

Writer (OrderSerialize):

java
objectOutputStream.writeObject(orderItem);   // 1st
objectOutputStream.writeObject(order);       // 2nd
objectOutputStream.writeObject(address);     // 3rd

Reader (old Driver):

java
Order order = (Order) ois.readObject();          // 1st: but 1st written is OrderItem!
OrderItem orderItem = (OrderItem) ois.readObject();
Address address = (Address) ois.readObject();

Once the file is found, this fails with ClassCastException: OrderItem cannot be cast to Order. Objects come out of
* the stream in exactly the order they went in, so the reader must follow the writer: OrderItem, then Order,
*  then Address.*/

