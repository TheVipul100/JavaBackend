public interface IPaymentMethod {

    String getName();
    int MAX_LIMIT_BALANCE=1_00_000;

    int getBalance();
    boolean validate(int amount);
    int calculateFee(int amount);
    void debit(int total);


    default void pay(int amount){
        System.out.println("Amount to be paid: " + amount);
        if(!validate(amount))
        {
            System.out.println("insufficient balance");
            return;
        }

        int payment = calculateFee(amount);
        int total = amount + payment;
        debit(total);
        System.out.println("Pay: " + payment);
        System.out.println(("SUCCESS --- Remaining balance: " + getBalance()));
    }

    private void print(String msg)
    {
        System.out.println(msg);
    }

}
