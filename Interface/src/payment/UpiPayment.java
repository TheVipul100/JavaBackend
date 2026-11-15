public class UpiPayment extends BasePayment{


    public UpiPayment(String accountId, int balance)
    {
        super(accountId,balance);
    }

    @Override
    public void debit(int total) {
        balance -= total;
    }
}