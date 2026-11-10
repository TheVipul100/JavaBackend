package Pract;

public class Pract1 {

    static
    {
        System.out.println("static");  //1st

    }

    {
        System.out.println("instance");  //2nd 2 times

    }

    Pract1(){
        super();
        System.out.println("constructor called");
    }

    static void main() {
        new Pract1();
        new Pract1();
    }
}
