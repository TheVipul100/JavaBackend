package practicingRealWorld;

public class Driver {

    public static void main(String[] args) {
        AmazonCust cust = new AmazonCust();
        AmazonCust cust1 = new AmazonCust("vipul@1234", "prakashvipul@mail", "23242324");

        int amount = 5000;

        cust.addMoney(amount);
        cust.addMoney(amount);
        cust.displayBal();

        cust1.addMoney(amount);
        cust1.displayBal();

        // password rules are enforced by the class, not by the caller
        System.out.println("Short password accepted? " + cust1.setPassword("124"));
        System.out.println("Change with wrong old password: " + cust1.passwordChange("2324", "22222222"));
        System.out.println("Change with correct old password: " + cust1.passwordChange("23242324", "22222222"));

        // wallet can't be touched directly, only through pay/addMoney
        System.out.println("Pay 7000: " + cust1.pay(7000));
        System.out.println("Pay 2000: " + cust1.pay(2000));
        cust1.displayBal();

        // invalid values passed to the constructor fall back to safe defaults
        AmazonCust bad = new AmazonCust("rahul@99", "rahulmail", "123");
        System.out.println("Email after bad signup: " + bad.getEmail());
        System.out.println("Verify with invalid password: " + bad.verifyPassword("123"));
    }
}