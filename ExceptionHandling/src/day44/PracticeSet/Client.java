package day44.PracticeSet;

import java.util.Scanner;

public class Client {
    static void main(String[] args) {

        //exception propagation

        //Exception propagation in Java is the process by which an unhandled exception travels down the call stack
        //from the method where it occurred to previous calling methods until it is caught. If no method handles
        // the exception before it reaches the main() method, the Java Virtual Machine (JVM) terminates the program
        // and prints the stack trace exception handling is done using try-catch block(alternative way)
        try {
            try {
                throw new RuntimeException("A");
            } catch (RuntimeException e) {
                try {
                    throw new IllegalStateException("B");
                } catch (IllegalStateException ed) {
                    System.out.println("exception occurs at inside the illegalStateException");
                }
            } finally {
                System.out.println("F1");//2
            }
        } catch (Exception e) {
            System.out.println("inside this");
            System.out.println(e.getMessage());
        }
        //        try {
        //            try {
        //                int a = 10 / 0;
        //            }
        //            catch (NullPointerException e) {
        //                // if the parent class exception object is there then child class exception catch will be ignored
        //                // Exception e then below statement will be executed as here NPE is specific so it wont be executed
        //                System.out.println("inner catch");
        //            }
        //            finally {
        //                System.out.println("inner finally");  //1  finally will always execute.... even nested once
        //            }
        //        } catch (ArithmeticException e) {
        //            System.out.println("outer catch");//2
        //        }
        //        finally {
        //            System.out.println("outer finally");//3
        //        }

        //    }
        //    IllegalStateException

        //    ArrayIndexOutOfBoundsException
    }
}
