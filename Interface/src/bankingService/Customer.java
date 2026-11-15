package bankingService;

public class Customer implements IBankService,ILoanService{

    //multiple inheritance/interface
    public void deposit(int amount)
    {
        System.out.println(".........." + amount);
    }

    public void create(IBankService bank)
    {
        System.out.println("upcasting being performed on " + bank);
        bank.deposit(234);
    }
}
