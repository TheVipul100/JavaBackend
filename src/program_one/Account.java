package program_one;

class Account {// multilevel inheritance
     public void openAccount(String userId,String name)   // additional func. add that needs to be inside now other functions as well adding name
     {
         System.out.println("Account.openAccount");
     }

}

class SavingsAccount extends Account{
    @Override  //
    public void openAccount(String userId,String name)
    {
        System.out.println("SavingAccount.openAccount");
    }
}
class SrCitAccount extends SavingsAccount{
    @Override
    public void openAccount(String userId,String name)    // compile time error : Method does not override method from its superclass
    {
        System.out.println("SrCitAccount.openAccount");
    }
}

class PensionAccount extends SrCitAccount {

    @Override
    public void openAccount(String userId,String name) {
        System.out.println("Pension.openAccount");
    }
}



//disad.  of inheritance
// tightly coupled : if there is a change in parent class then all the subclasses needs changes as they are overridden
//2. heavy loading  : (is-a rltp is always heavy)subclasses methods are highly overloaded on their parent class. as even to ,
// load pensionAccount we need to load other classes first.
// superclass must be initialised before the current class till object class (hierarchy)



//(has-a) is Loosely coupled

// naturally order should be there. superUser "is-a" User

// class User{

//Order order;  // HAS-A  USER HAS AN ORDER;  //SHOULD NOT BE FORCED IT SHOULD BE NATURAL IN
//}