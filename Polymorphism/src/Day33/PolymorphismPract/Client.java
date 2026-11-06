package PolymorphismPract;

import java.util.Stack;

public class Client {

    static void main(String[] args) {
//        AirlineTicketing airline = new BusinessClass();
//        airline.ticketingPrice();

//        AirlineTicketing air = new FrequentClass();
//        air.ticketingPrice();
        // Not a good design
        //
        // in this case u will be calling ticketingPrice() on each object and if there is a change in  this method of parent
        // then all objects overriding this method will need to change its method order, type, parameter .....
        // direct exposure to the outside world

        // thats why we create a class process that has this

        AirlineTicketingProcess airProcess = new AirlineTicketingProcess();

        // user wants to purchase business class ticket then

        BusinessClass busticket = new BusinessClass();
        airProcess.processingPrice(busticket);

        // 2 user that goes for standard ticket
        StandardClass stdticket = new StandardClass();
        airProcess.processingPrice(stdticket);

        //3
        FrequentClass frew= new FrequentClass();
        airProcess.processingPrice(frew);

    }
}
