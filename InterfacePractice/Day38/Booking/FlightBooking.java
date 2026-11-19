package Day38.Booking;

public class FlightBooking implements IBooking {


    @Override
    public void book() {

    }

    @Override
    public void cancelBooking() {
        System.out.println("Day38.Booking.FlightBooking.cancelBooking()...........");
    }

    @Override
    public void checkStatus() {

    }

    // autoUpgrade() is not overridden on purpose: FlightBooking uses the default from IBooking.


    // Java 8: the static method of the interface is called through the interface name
    public static void printFlightTicket(String path,String content)
    {
        System.out.println("static method---common funct. of interface is being accessed here in flightBooking");
        IBooking.printTicket("airline","premium");
    }
}
