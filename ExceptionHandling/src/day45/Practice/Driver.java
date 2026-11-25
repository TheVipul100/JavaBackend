package day45.Practice;

public class Driver {

    static int test() {  //	Method returns the saved value 3 so it gets printed at last
        int x = 1;
        try {
            try {
                x = 2;
                throw new RuntimeException("A");
            } catch (RuntimeException e) {
                x = 3;
                return x;  //use of  --->>>>>>return x, saves the value 3 as the returned value/
            } finally {
                x = 4;
                System.out.println("F1 " + x);
                //return x;  //overrides the previous value that was saved for x;
            }
        } finally {
            x = 5;
            System.out.println("F2 " + x);
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}

/*
* When Java reaches return x, it copies the current value (3) aside. Then the finally blocks run and change the
* variable x, but the already-saved return value doesn't change. This works for primitives like int. For an object
*  reference, finally could still modify the object's contents, but not which object is returned.
*
* The only way finally changes the result is if it has its own return (Q6 in the first set), which is a bad practice.
* thats why compiler gives u warning.
* */