package Excercise;


public class Cons implements greeter{

    @Override
    public void attend(int a)
    {
        System.out.println("Class version:  " + a);
    }

    public static void main(String[] args) {
        greeter g1 = new Cons();
        g1.attend(100);                       // named class

        greeter g2 = new greeter(){
            @Override
            public void attend(int a)
            {
                System.out.println("anonymous class version: " + a);
            }
        };  // anonymous class


        g2.attend(200);
        /*
           What a lambda is

            A lambda is a short way to write the one method of a functional interface, without writing a whole class.

            (parameters) -> body

             The compiler looks at where you are using it, finds the interface expected there, and treats your lambda
             as the implementation of the single abstract method of that interface.
         */

        greeter g = a -> System.out.println("Lambda version : " + a);
        g.attend(300);

    }

}
