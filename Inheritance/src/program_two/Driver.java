package program_two;

public class Driver
{
    static void main(String[] args) {
      OpenSaving openSaving=new OpenSaving();
        openSaving.openSavingAccount("1234");

        // multilevel
        Type t = new Type();
        t.Account("123",43545);

        //hierarchical


        /**
         * Method hiding the method that is called is of reference type and not object type;
         *Method hiding:when a child class defines a static method with the same name and same signature as of a static method
         * in the parent class is called method hiding.------->>>>>
         * static binding(compiler decides which method to be called at compile time by reference type/)
         *it is based on compile time. compiler decides on the basis of reference type.  // no polymorphism in method hiding
         */

        // method overridden--->>>dynamic binding
        // it allow subclass to change the functionality(specific implementation to a general behavior) of a method which is written in parent class basically extend/modify
        Account acc= new OpenSaving();
        acc.firstMethod();



//        Account acc = new OpenSaving();
//        OpenSaving open =(OpenSaving) acc;
//        open.firstMethod();




        OpenSaving op = new OpenSaving();
        System.out.println(op.a);

        Account ac = op;  // to access variable hidden  via parent reference type resolves  to parent var.
        System.out.println(ac.a + " parent ka hai ");

    }
}


//single
class Account
{
    int a = 10;
    public void account(String userId)
    {
        System.out.println(userId);
    }
     static void firstMethod()
    {
        System.out.println("Running account");
    }
}

class OpenSaving extends Account{
    int a=102;
    public void openSavingAccount(String name) {
        System.out.println(name);
        account("1234");
        System.out.println(this.a); // or a; access child class var.

        System.out.println(super.a);// accesses a parent var.
        // var. hiding when both classes have same var. name then parent var. is hidden by child object.
    }

       static void firstMethod()
    {
        System.out.println("firstMethod......");
    }

}
