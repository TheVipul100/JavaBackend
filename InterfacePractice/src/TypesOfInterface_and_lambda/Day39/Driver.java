package TypesOfInterface_and_lambda.Day39;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(20, new Address("Pune"));
        Person p2 = p1.clone();

        p2.age = 30;
        System.out.println(p1.age + " " + p1.address.city);  // 20 Pune ---> primitive field is independent

        Person p3 = p1;     // NOT a copy, just another name for the same object
        p3.age = 99;
        System.out.println(p1.age);  // 99 ---> same object, so the original changed

        // Shallow copy: p1 and p2 share the same Address object.
        p2.address.city = "Delhi";
        System.out.println(p1.address.city);  // Delhi ---> the original changed (mutable shared object)

        // Deep copy: the Address is copied as well.
        Person p4 = p1.deepCopy();
        p4.address.city = "Mumbai";
        System.out.println(p1.address.city);  // still Delhi ---> original unaffected
    }
}

/*
* main:  p1.clone()
         |
         v
Person.clone():  return super.clone()
                          |
                          v
                 Object.clone()  -> creates copy, returns it
                          |
         <----------------+
         |
         v
main:  copy is stored in p2*/
