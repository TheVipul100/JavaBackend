package Netflix_Subscription;

public class StandardPlan extends Subscription{

    public StandardPlan(String user_Id, int monthlyfee) {
        super(user_Id, monthlyfee);
    }

    public void strdPlan()
    {
        System.out.println("Standard Plan includes: ");
        displayPlan();
    }


    @Override
    int getMaxScreens(){
         return 2;
    }

    @Override
    String getVideoQuality(){
        return "1080px";
    }

    @Override
    float calculateYearlyCost(){
     return super.calculateYearlyCost() * 0.95f;
    }

}
