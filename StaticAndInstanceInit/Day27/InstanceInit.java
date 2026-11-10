public class InstanceInit {
    static void main(String[] args) {
        StrinNumber sc= new StrinNumber("2343545");
        StrinNumber sc2= new StrinNumber("34");
    }

  static {  //1st line above
      System.out.println("Static block created.......");
  }

}

class AccountMgmt {
    public AccountMgmt() {
        System.out.println("Account created") ;
    }
}

class StrinNumber extends AccountMgmt{

    String accountNumber;

    {
         // used for generic purpose
        System.out.println("Account IIB");
    }

    public StrinNumber(String accountNumber){
        super();  //or this ---->>>>>>>>>. 1st

        //call to init block 2nd call
        System.out.println("Account  established");
        this.accountNumber=accountNumber;
    }

}