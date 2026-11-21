package eCommerceSerialized;

import java.io.Serializable;

public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sku;
    private int quantity;
    private int price;

    public OrderItem(String sku, int quantity, int price) {
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
    }

    public int totalPrice()
    {
        return quantity * price;
    }
    @Override
    public String toString(){

        return "sku price is :" + totalPrice();
    }
}
