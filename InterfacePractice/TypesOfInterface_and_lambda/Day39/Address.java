package TypesOfInterface_and_lambda.Day39;

public class Address
    {
        String city;
        Address(String city)
        {
            this.city = city;
        }
    }

    class Person implements Cloneable {
        int age;
        Address address;

        Person(int age, Address address) {
            this.age = age;
            this.address = address;
        }


        // Shallow copy. Covariant return type (Person) removes the need for a cast in the caller.
        @Override
        public Person clone() throws CloneNotSupportedException {
            return (Person) super.clone();
        }

        // Deep copy: the mutable Address object is copied too, so nothing is shared.
        public Person deepCopy() throws CloneNotSupportedException {
            Person copy = (Person) super.clone();
            copy.address = new Address(address.city);
            return copy;
        }

        // Object class --->>>>> protected native Object clone() throws CloneNotSupportedException;

        /*
        * It is a native method, meaning it is implemented inside the JVM, not in Java code. It does this:

        1.Looks at the object it was called on (the current object, this).
        2.Allocates a brand new object of the same actual class (Person, not plain Object).
        3.Copies every field value from the current object into the new one (the shallow copy).
        4.Returns the new object.
        * */
}
