package Excercise;

@FunctionalInterface
public interface greeter{

     void attend(int a); // interface methods are implicitly public
    // An implementing class that declares it without public gets a compile error:
    // "attempting to assign weaker access privileges"
}
