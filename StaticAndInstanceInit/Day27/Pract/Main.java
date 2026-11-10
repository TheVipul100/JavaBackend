package Pract;

class Parent {
    static
    {
        System.out.println("P static");
    }


    Parent()
    {  //super()

        System.out.println("P constructor");
    }
    {
        System.out.println("P instance");
    }
}
class Child extends Parent {   // 1st super exe.

    static {
        System.out.println("C static");
    }

    {
        System.out.println("C instance");
    }
    Child() {
        ////super()
        System.out.println("C constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        new Child();

    }
}


// p static