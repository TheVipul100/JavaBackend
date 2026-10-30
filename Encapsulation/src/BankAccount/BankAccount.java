package BankAccount;

class BankAccount {

//accountNumber, holderName, balance, pin
    private String accountNumber;
    private String holderName;
    private int balance;
    private String pin;

    public BankAccount()
    {
        this.accountNumber="000000";
        this.holderName=null;
    }
    public BankAccount(String accNum, String holdNam, int bal, String pin){
        this.accountNumber = accNum;
        this.holderName = holdNam;
        this.balance=bal;
        this.pin=pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean verifyPin(String input){
        if(this.pin.equals(input)) {
            System.out.print("Access Granted.....");
        return true;
        }
        else {
            System.out.println("Access denied....");
        }
        return false;
    }

    boolean deposit(int amount) {
        if (amount < 0)
        return false;

            balance = balance + amount;
            //System.out.println("Balance updated new balance : " + balance);
        return true;
    }

    public boolean withdraw(int amount)
    {
//        if(amount>0 && amount<=balance)
          if(amount <= 0 || amount > balance)
            return false;

          balance -= amount;
          System.out.println("NEW balance : " + balance);
            return true;
    }

    void displayDetail(String holderName,int balance)
    {
        System.out.println("Hey... " + holderName);
        System.out.println("Your balance is:" + balance);
    }
}
