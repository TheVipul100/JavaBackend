package account;

//public class FixedDeposit implements IAccount {
//    @Override
//    public int depositMoney(int amount) {
//        System.out.println(amount);
//        return 0;
//    }
//
//    @Override
//    public int withdrawMoney(int amount) {
//        return 0;
//    }
//
//    @Override
//    public int checkBalance() {
//        return 0;
//    }
//}

public class FixedDeposit implements IAccount {
    private int balance;

    public FixedDeposit(int amount)
    { this.balance = amount;
    }

    @Override
    public int depositMoney(int amount) {
        System.out.println("Deposits are locked in a Fixed Deposit");
        return balance;
    }

    @Override
    public int withdrawMoney(int amount) {
        System.out.println("Withdrawal allowed only after maturity");
        return balance;
    }

    @Override
    public int checkBalance()
    {
        return balance;
    }
}