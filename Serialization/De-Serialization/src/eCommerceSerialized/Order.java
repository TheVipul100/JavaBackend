package eCommerceSerialized;

import java.io.Serializable;

public class Order implements Serializable {

    private static final long serialVersionUID =1L;
    private String orderId;
    private String custName;
    private boolean orderStatus;

    private transient String cardNumber;
    private transient String total;   // recomputation

    public Order(String orderId, String custName, boolean orderStatus, String cardNumber, String total) {

        this.orderId = orderId;
        this.custName = custName;
        this.orderStatus = orderStatus;
        this.cardNumber = cardNumber;
        this.total = total;
    }


    @Override
    public String toString()
    {
        //int orderId=99;
        return this.orderId + " "+ this.orderStatus + " " + this.cardNumber;
    }




}
