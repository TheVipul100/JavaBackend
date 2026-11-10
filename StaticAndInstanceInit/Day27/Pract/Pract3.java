package Pract;

class P {
    P()
    {
        show();
    }
    void show()
    {
        System.out.println("P show"); }  //1   x = 10
}
class C extends P
{
    int x = 10;
    C()
    {
        super();
        //x=10;
    }
    void show()
    {
        //x=10;
        System.out.println("x = " + x);  // runtime poylmorphism method overriding
    }
}
public class Pract3{
    static void main(String[] args) {

        new C();
    }
}


// show fn. is overridden and exec in C so only one show() exe.
//Java picks the version based on the actual object type (C)
//not on the class where the call is written (P). This is dynamic dispatch (runtime polymorphism).


//diff. from parent in Main.java
//the order of constructor and block execution was parent first, then child.
// That’s about "initialization order." Method calls work differently: they always go to the most overridden
// version, even when called from inside the parent’s constructor.