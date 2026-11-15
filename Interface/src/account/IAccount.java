package account;

public interface IAccount {

    final static int MIN_BALANCE = 2000;  //constant
    int depositMoney(int amount);
    int withdrawMoney(int amount);
    int checkBalance();
}
