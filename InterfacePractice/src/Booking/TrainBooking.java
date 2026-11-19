package Day38.Booking;

public class TrainBooking implements IBooking {

    @Override
    public void book() {

    }

    @Override
    public void cancelBooking() {
        System.out.println("Day38.Booking.TrainBooking.cancelBooking()..........");
    }

    @Override
    public void checkStatus() {

    }

    /**
     * Java 8 introduced the default keyword for backward compatibility
     * (adding new functionality to an interface should not break existing implementing classes).
     * TrainBooking overrides the default to give it train-specific behaviour.
     */
    @Override
    public void autoUpgrade() {
        System.out.println("Optional feature is added in train Booking.Booking.autoUpgrade().......");
    }

    public void printTrainTicket(String path,String content)
    {
        System.out.println(path + content);
    }
}
