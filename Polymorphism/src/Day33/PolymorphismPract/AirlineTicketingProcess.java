package PolymorphismPract;

public class AirlineTicketingProcess {

    public void processingPrice(AirlineTicketing airlineTicketing){  // we pass the object of parent type as an argument
        // so that any object can be referred through this and this class having this method will be exposed to the outside world

        airlineTicketing.ticketingPrice();
    }
}
