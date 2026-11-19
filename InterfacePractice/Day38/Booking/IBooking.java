package Day38.Booking;

public interface IBooking {


    public abstract void book();

    void cancelBooking();

    void checkStatus();

    // Optional feature: classes that do not need it simply inherit the default.
    // Without default methods, every class would have to implement it, even with an empty body.

    public default void autoUpgrade() {      //default keyword is not an access specifier ---------> optional
        // connecting with DB (25 lines), checking status, upgrading

        connectDb();
        System.out.println("IBooking.autoUpgrade().........");
    }

    public default void sendNotification() {      //default keyword is not an access specifier ---------> optional
        // connecting with the DB, getting user details and then sending the notification

        // common code -- connecting to DB (25 lines) -- would be duplicated without a private method

        connectDb();

        System.out.println("IBooking.sendNotification().........");
    }

    public static void printTicket(String path, String contents)  // Java 8 ------ introduced common functionality
    {
        /**
         * Static interface methods (Java 8): utility functionality shared by all implementing classes.
         * Static methods are NOT inherited, so call it as IBooking.printTicket(...).
         */
        System.out.println("StaticMethod.....in interface");
    }

    private void connectDb()
    // Java 9: a private method lets the default methods share code (DB connection)
    // without exposing it to implementing classes or the outside world.
    {
        System.out.println("connecting...........");
    }


    static void main(String[] args) {
        IBooking book = new FlightBooking();
        book.cancelBooking();
        book.autoUpgrade();                    // default method from the interface

        IBooking train = new TrainBooking();
        train.autoUpgrade();                   // overridden default method

        FlightBooking.printFlightTicket("AirIndia", "premium");
    }
}

/**
 * Without a private method, common code (for example connecting to the DB) would be written again in every
 * default method (sendNotification, autoUpgrade...). Java 9 added private interface methods so that
 * the common code is written once and called from the default methods that need it.
 */


/**
 * static() ----> Java 8 utility functionality: common functionality that implementing classes
 * such as FlightBooking and BusBooking can share, defined once inside the interface.
 * e.g. fundTransfer and fdAmount both need a balance check, so add checkBalance() to the interface.
 */
