package discountOnServices;

public class Driver {

    public static void main(String[] args)
    {
        FlightBooking flight = new FlightBooking();
        flight.calculateDiscount(2000,2);

        IDiscount id =  new FlightBooking();
        id.calculateDiscount(20020,12);
    }
}
