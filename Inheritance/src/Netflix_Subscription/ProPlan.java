package Netflix_Subscription;

public class ProPlan extends Subscription{

    public ProPlan(String userId , int monthlyFee)
    {
        super(userId,monthlyFee);
    }

    public void proPlan(){
        System.out.println("Pro Plan includes: ");
        displayPlan();
    }

    @Override
    int getMaxScreens(){
        return 4;
    }

    @Override
    String getVideoQuality(){
        return "4k";
    }

    @Override
    float calculateYearlyCost()
    {
        return super.calculateYearlyCost()*0.90f;
    }
}
