package eCommerceSerialized;

import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws IOException {

        Order order= new Order("123","Vipul", false,"2345 5677","stock left...");

        Address address = new Address("banglore","56788","34th cross road");
        OrderItem orderItem = new OrderItem("HJ12SHDF",12,30000);

        OrderSerialize serialOrder = new OrderSerialize();
        serialOrder.serializeOrder(orderItem,order,address);

    }
}
