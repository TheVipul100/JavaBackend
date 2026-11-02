package abstraction;

class Order {

    public void placeOrder(String orderId, String holderName,String dishName,int payment )
    {
        // accesible to the outside world
        orderNumber(orderId,holderName);
        dish(dishName);
        pay(payment);
    }

    //core functionalities
    private void orderNumber(String orderId,String holderName)
    {
        System.out.println("Order " + orderId + " placed by " + holderName);
    }
// core functionalities
    private void dish(String dishName)
    {
        System.out.println("Preparing dish: " + dishName);
    }
    private void pay(int payment){
        System.out.println("Amount to be paid.." + payment);
    }
}

