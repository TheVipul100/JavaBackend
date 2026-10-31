package program_two;

//Multilevel
class CurrentAccount extends Account{

    public static void Account(String userId,String balance)
    {
        System.out.println(userId + " "+ balance);
    }
}

class Type extends CurrentAccount{

    public static void Account(String userId,int CurrentBalance)
    {
        System.out.println(userId + " " + CurrentBalance);
    }
}





