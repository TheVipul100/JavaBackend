package discountOnServices;

public class FlightBooking implements IPropertyTax{
    @Override
    public int calculateDiscount(int amount, int rate) {
        int fare =  amount - (amount * rate)/100;
        System.out.println("fare is ......." + fare);
        return fare;
    }

    @Override
    public void calculateDiscountTax(int tax) {
        System.out.println("Tax: " + tax);
    }

    @Override
    public void calculatePropertyTax() {
        System.out.println("Property tax calculated");
    }
}
