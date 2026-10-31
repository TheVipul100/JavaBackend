package program_two;

//hierarchical
class CitBelowSixty extends Account {

    public void Account(String userId)
    {
        System.out.println(userId);
    }
}

class SrCit extends Account{
    public void Account(String userId)
    {
        System.out.println(userId);
    }

}
