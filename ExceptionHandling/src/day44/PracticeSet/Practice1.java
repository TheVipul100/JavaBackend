package day44.PracticeSet;

public class Practice1 {

    public static void main(String... args)
    {

        try{
           try
           {
             throw new RuntimeException("Throwing an exception.....");
           }
           catch(RuntimeException rt)
           {
               System.out.println("inner " + rt.getMessage());
               throw rt;   // rethrowing
           }
        }
        catch (RuntimeException rt2) {
            System.out.println("outer handler " + rt2.getMessage());
        }



        /*
        * 2nd problem
        * */
        try {
            try {
                System.out.println("try");
            } finally {
                throw new RuntimeException("from finally");
            }
        } catch (RuntimeException e) {
            System.out.println("caught: " + e.getMessage());
        }
        try {
            System.out.println("1");
//            Object o1 = null;
//            o1.toString();
            try {
                System.out.println("2");  // may be risky u cant say that it cannot be an exception
                try {
                    System.out.println("3");
                    Object o = null;
                    o.toString();  //--- exception occurs
                } catch (ArithmeticException e) {
                    System.out.println("4");
                }
                System.out.println("5");
            } catch (NullPointerException e) {  //-- handle the exception
                System.out.println("6");
            }
            System.out.println("7");
        } catch (Exception e) {
            System.out.println("8");
        }
    }
}
