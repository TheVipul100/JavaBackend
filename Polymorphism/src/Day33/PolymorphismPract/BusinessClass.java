package PolymorphismPract;

public class BusinessClass extends AirlineTicketing{

    @Override
    protected void ticketingPrice()
    {
        System.out.println("Ticketing price of Business class........");
    }
}
