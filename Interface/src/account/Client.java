package account;

public class Client {

     public static void main(String[] args) {

        SavingsAcc sav = new SavingsAcc();
        sav.depositMoney(30000);


        IAccount account = new SavingsAcc();  // class
        account.depositMoney(2000);  //1

        // won't compile: sett() is not in IAccount


        CurrentAcc cur = new CurrentAcc(20);
        account.depositMoney(200);

        IAccount ac1 = new CurrentAcc(34000);
        ac1.depositMoney(890);
        ac1.withdrawMoney(30000);


         // downcasting: works because the object really is a SavingsAcc
        SavingsAcc save =(SavingsAcc) account;
        save.sett(account);
        FixedDeposit fd = new FixedDeposit(20000);

          fd.depositMoney(200);


    }


}
