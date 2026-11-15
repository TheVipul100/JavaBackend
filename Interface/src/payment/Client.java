
public class Client {
    public static void main(String[] args) {

        // upcasting: child objects, interface references
        IPaymentMethod card = new CardPayment("CARD-101", 20000);
        IPaymentMethod upi = new UpiPayment("UPI-202", 5000);

        IPaymentMethod[] methods = { card, upi };

        // same call, different behaviour (fee differs per class)
        for (IPaymentMethod method : methods) {
            System.out.println("--- " + method.getName() + " ---");
            method.pay(1000);
            System.out.println();
        }

        // not enough balance left, so this is rejected
        System.out.println("--- " + upi.getName() + " (second payment) ---");
        upi.pay(5000);

       //  BasePayment base = new BasePayment("4567", 100);   // won't compile: abstract class
    }
}
