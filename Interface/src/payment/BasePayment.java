public abstract class BasePayment implements IPaymentMethod{
// bcz requirements says that class cannot be instantiated

    String accountId;
    int balance;

    public BasePayment(String accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }




    @Override
    public String getName() {
       return accountId;
    }

    @Override
    public int getBalance() {
       return balance;
    }

    @Override
    public boolean validate(int amount) {
        return amount > 0 && amount + calculateFee(amount) <= balance;
    }

    @Override
    public int calculateFee(int amount) {
        return amount * 2 / 100;          // 2% fee

    }
}
