package methodOverloading;

public class Client extends Login {

    public static void doLogin(int name)
    {
        System.out.println("doLogin().Client......... " + name);// method hiding
    }
    public static void main(String[] args) {

        Login login = new Login();
        doLogin(344);

        Login log = new Client();


        // log.doLogin(234); (==========) Login.doLogin(1);      // method hiding even using classname reference or direct call class method print

        log.doLogin(234);

        login.doLogin("creta","showCase");

        login.doLogin("clause",43546);  // as the method is private we cannot access it and it is referring to other method
    }
}


//1. flexibility to the client

// u cannot just give some feature to the client and say do based on this provide flexible
// lets say for login we give email , mobile, email and password so method name same change arguments
// so caller will supply as per method overloaded
// static method in overloaded case is possible belongs to class

// static method in overridden case isnt possible that is called method hidden (static method in parent and non-static in instance);