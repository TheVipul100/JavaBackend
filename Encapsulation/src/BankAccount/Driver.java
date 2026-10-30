package BankAccount;

public class Driver{

    static void main(String[] args) {
        int amount;


        // inheritance in action

        BankAccount bankAcc = new BankAccount();

        BankAccount baAcc = new BankAccount("2345", "vipul", 234555, "234567");

        BankAccount baAcc1 = new BankAccount("1234", "rahul", 2394, "123");



        // baAcc1.balance;  //  class hiding its internal data and exposes control access through methods to the field
        baAcc1.setBalance(234);
        System.out.println(baAcc1.getBalance());

        BankAccount[] arr = {bankAcc, baAcc, baAcc1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBalance() > 0) {
                if(baAcc1.verifyPin("123"))
                  arr[i].displayDetail(arr[i].getHolderName(), arr[i].getBalance());
            }
        }
    }
}
