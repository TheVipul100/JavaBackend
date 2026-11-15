package bankingService;

public class Client {

    static void main(String[] args) {
        Customer cust = new Customer();
        cust.deposit(230000);

        IBankService bank = new Customer();
        bank.deposit(23);
        cust.create(bank);

        Customer cu = (Customer) bank;


    }


}
