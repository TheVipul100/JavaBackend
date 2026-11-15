package discountOnServices;

public class CabBooking implements IDiscount{

     private String userName="";
//   constructor cant be static  object. kese create krega
    private CabBooking(String userName){
    this.userName = userName;
    }

    @Override
    public int calculateDiscount(int amount,int tax)
    {
     return amount - (amount * tax) / 100;
    }

    @Override
    public void calculateDiscountTax(int tax) {
        System.out.println(userName + " tax: " + tax);
    }
}
