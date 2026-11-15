package account;

public class CurrentAcc implements IAccount {

  int balance;
     public CurrentAcc(int balance){
         this.balance = balance;
     }

    @Override
    public int depositMoney(int amount) {
        if(amount>0) {
            balance+=amount;
            System.out.println("updated balance : " + balance);
        }
        return balance;
    }

    @Override
    public int withdrawMoney(int amount) {
         if(balance>=0 && amount<=balance)
         {
             balance-=amount;
             System.out.println("withdrawn amount : " + amount );
             System.out.println("updated balance: " + balance);
         }
        return balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }
}
