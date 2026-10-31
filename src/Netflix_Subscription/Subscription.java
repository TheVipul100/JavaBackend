package Netflix_Subscription;

//parent
public class Subscription {

    protected String user_Id;  //encapsulation
    protected int monthlyfee;

    public Subscription(String user_Id,int monthlyfee){
        this.user_Id=user_Id;
        this.monthlyfee=monthlyfee;
    }

    public void displayPlan() {

        System.out.println("Plan Details: " + user_Id);
        //    System.out.println("Basic Plan" + );
        //    System.out.println("Standard Plan");
        //    System.out.println("Pro Plan..");
        System.out.println("Monthly Fee: " + monthlyfee);
        System.out.println("Free Trial Screens: " + getMaxScreens());
        System.out.println("Quality: " + getVideoQuality());
        System.out.println("Yearly cost : Rs. " + calculateYearlyCost());
    }

    float calculateYearlyCost(){
        return monthlyfee*12;
    }

//    getMaxScreens(), getVideoQuality(),

    int getMaxScreens() {               // same signature, new behavior
        return 1;
    }

    String getVideoQuality()
    {
    return "480px";
    }

}
