package Pract;

class T {
    //static int a = m1();  // since static a calling method so this exe. first then static block
    int a = m1();

    static {
        System.out.println("static block");
    }

    static int b = m2();

    static int m1() {
        System.out.println("m1");
        return 1;
    }
    static int m2() {  // static method  executes after static block then normal variable exe.
        System.out.println("m2");
        return 2;
    }

    public static void main(String[] args) {
        new T();
    }

}
