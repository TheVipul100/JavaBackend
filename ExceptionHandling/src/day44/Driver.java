package day44;

// never assume that string cant be null u as a developer have to do the needfull. eg. parking in front of house.
class Account{

}
public class Driver {


    static void main(String[] args) {

        System.out.println("Driver..Main()....Start.....");

        String  name = args[0];

        int marks = Integer.parseInt(args[1]);  // if arguments are not passed from CLA then arrat index out of bound exception
    /*
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
     	at day44.Driver.main(Driver.java:16)
     */


        /*
        * Exception in thread "main" java.lang.NumberFormatException: For input string: "sfbhd"  if string is passed in place of int
	      at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	      at java.base/java.lang.Integer.parseInt(Integer.java:565)
	      at java.base/java.lang.Integer.parseInt(Integer.java:662)
	      at day44.Driver.main(Driver.java:16)
        * */



//        ArrayIndexOutOfBoundsException
        System.out.println(name);
        System.out.println(marks);

        int amount=100;
        int part=0;

        String account = null;  // the object doesnt exist.......

        /*
        * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "account" is null
        	at day44.Driver.main(Driver.java:36)
        * */


        try {

            //risky code which may throw an exception
            int total = amount / part;  //catches the first error  AE
            System.out.println(account.length());
            System.out.println(total); // ignored
        }
        catch (ArithmeticException e){   // this can catch the exception object and the child object
            System.out.println("amount is being divided by zero not possible");
//            e.getStackTrace();
            e.printStackTrace();
        }

        // Exception e      // parent of all exceptions.
        catch(NullPointerException exc)
        {
            System.out.println("name cannnot be null");
//            exc.printStackTrace();
        }

        /*
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	       at day44.Driver.main(Driver.java:24)
	* */






        System.out.println("Driver... Main().......End");

    }
}
