package account;

public class SavingsAcc implements IAccount {

    int balance;  //super()
    @Override
    public int depositMoney(int amount)
    {
        balance+=amount;
        System.out.println(balance);
        return balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public int withdrawMoney(int amount) {
        if(amount>0 && balance-amount>=MIN_BALANCE )  // min balance
        {
            balance-=amount;
            System.out.println("Withdrawn: " + amount + ", balance: " + balance);
        } else {
            System.out.println("Withdrawal denied: minimum balance is " + MIN_BALANCE);
        }
            return balance;
    }

    public void sett(IAccount acc)
    {
        System.out.println("hashcode ...." + acc);
    }
}
