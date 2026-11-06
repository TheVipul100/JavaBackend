package Day35;

public class Driver {

    static void main(String[] args) {

        Delivery delivery = new Delivery();
        delivery.doDelivery(); // parent

        Delivery deli1 = new ExpressBee();
        deli1.doDelivery();  // compile time checks if present or not
        // runtime it will call the method of expressBee

        Delivery del2= new Ekart();
       // del2.hashCode(); // checks if present in the parent vclass if not then checks the Object class
        del2.doDelivery();

        Delivery del3 = new ExpressBee();

       // ExpressBee express = (ExpressBee) new Delivery(); // cannot convert Delivery object to expressBee  gives CCE

        ExpressBee express1 = (ExpressBee) del3;
        express1.doDelivery();

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum Heap Size: " + (maxMemory / (1024 * 1024)) + " MB");
    }

}
