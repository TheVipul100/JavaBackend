public class CardPayment extends BasePayment {

    public CardPayment(String accountId,int balance){
        super(accountId, balance);
    }
    @Override
    public int calculateFee(int amount) {
        return amount;
    }

    @Override
    public void debit(int total) {
        balance-=total;
    }
}