package TypesOfInterface_and_lambda.Day40;

@FunctionalInterface // also called SAM: single abstract method
public interface IAccount{         // if it extended IAccountMgmt it would have 2 abstract methods, so it would not be a functional interface

    String openAccount(String name, String address , long balance);  // the one abstract method; returns the account id

    /**
     * Only one abstract method, but any number of default and static methods.
     * Functional interfaces are implemented with lambda expressions (Java 8).
     * Single-method interfaces such as Runnable and Comparator existed before Java 8;
     * Java 8 added lambdas and the @FunctionalInterface annotation, which makes the compiler
     * report an error if a second abstract method is added. The annotation is optional for lambdas to work.
     *
     * LAMBDA EXPRESSION : implementing a method without a name
     */


    default void addBeni()
    {
         // optional
    }
}


/**
 * If one interface extends another, the child interface gets the abstract methods of the parent as well,
 * so it can end up with two abstract methods and stop being a functional interface.
 */

/**
 * Types of interface (by their members)
 * 1---- normal interface -- any number of abstract methods
 * 2---- functional interface -- exactly one abstract method
 * 3---- marker interface -- empty, no methods (e.g. Cloneable, Serializable)
 * 4---- nested interface -- declared inside a class or another interface
 *
 */
