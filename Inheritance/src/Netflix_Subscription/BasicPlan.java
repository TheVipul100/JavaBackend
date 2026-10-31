package Netflix_Subscription;

public class BasicPlan extends Subscription{

    public BasicPlan(String user_Id, int monthlyfee) {
        super(user_Id, monthlyfee);
    }

    public void basicPlan(){
        System.out.println("Basic Plan Includes: ");
       // 1 screen, 480p, plus a showAdsNotice() method
        displayPlan();
    }
    @Override
    int getMaxScreens()
    {
       return 1;
    }

    @Override
    String getVideoQuality()
    {
       return "720px";
    }



}
