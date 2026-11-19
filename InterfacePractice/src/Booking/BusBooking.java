package Day38.Booking;

public class BusBooking implements IBooking {
    @Override
    public void book() {

    }

    @Override
    public void cancelBooking() {

    }

    @Override
    public void checkStatus() {
        System.out.println("Day38.Booking.BusBooking.checkStatus()........");
    }

    // Not an override: static interface methods are not inherited,
    // so this is a separate method that only belongs to BusBooking.
    public static void printTicket(String path,String content)
    {
        System.out.println(path + " " + content);
    }


}
