package Pract;

public class Pract2 {

    {
        System.out.println("Instance init block");
    }
    Pract2(){
        this(100);
        System.out.println("Default Constructor");
    }

    Pract2(int x)
    {
        this(100,200);
        System.out.println("Parameterized constructor single param");
    }

    Pract2(int x, int y)
    {
        System.out.println("param const multiple param");
    }

    public static class T {
        static int a = m1();

        static {
            System.out.println("static block");
        }

        static int b = m2();

        static int m1() {
            System.out.println("m1");
            return 1;
        }
        static int m2() {
            System.out.println("m2");
            return 2;
        }
    }


    static void main(String[] args) {
      new Pract2();

       new T();
    }
}
