package methodOverriding;

class SavingAccount extends Account{

    public SavingAccount(int wsgfh, int i) {
        super(wsgfh);
    }

    @Override  // java 5 onwards

    // if not overridden then compiler treat it as a method of a class
    public void openAccount(String _name,int bal){
        {
            System.out.println("Savings.openAccount");

        }
    }
}


// 1. order , number and type of argument must be same (same signature--methodName with arguments)
//2.return type should be same except "co-variant"
//3.access modifier should be same or widen(protected ---- protected or public  or  public - public but private (parent)
// child cannot be public) -------------should not reduce visibility
//4.
