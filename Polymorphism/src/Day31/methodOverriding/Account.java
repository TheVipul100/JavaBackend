package methodOverriding;

class Account {
int x=10;
    public Account(){

        System.out.println(x);
    }

    public Account(int wud){
        this.x=wud;
    }
    public void openAccount(String name, int initBal)
    {
        System.out.println("Account.openAccount()");
    }

}
