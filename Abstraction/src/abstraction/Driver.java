package abstraction;

public class Driver {

    public static void main(String[] args) {
        Order ord = new Order();
        ord.placeOrder("@123","Vipul","Kadhai Paneer",300);
        //ord.orderNumber();
       // ord.dish();

        // we implement a class so that we can access the core functionalities which the outside class cannot access directly

        // we dont allow using core functionalites to be directly accessible by outside world or class .
        // otherwise there is no use of the class defined bcz directly u can use it by creating an obj. outside class

    }
}
