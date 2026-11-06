package auto_upcasting;

import java.util.Objects;

public class Driver {

    static void main(String[] args) {

        User u = new User();  // parent class

        Admin adm = new Admin();  // admin class referring to admin class obj.   Admin "Is-A" type of User

        Admin a1 = new Admin();
        System.out.println(a1.x);
        Admin aad = new Finance();  // admin parent

        User uc = new Admin();  //Parent class refers to child class obj;  auto upcasting  //(User) is optional

        User uc1 = new Admin();


      // Admin ad =(Admin) new User();  // explicit downcasting  -- gives classcastexception compiling but giving class cast exception
        //But in downcasting, no parent object is involved. The object is already a admin/user (child) object.
        // The only thing happening is that you switch from a parent-type reference to a child-type reference to see the child’s
        // full features


        //        reason for compile tiem error: parent class has n numbr of
        //        child classses so which class is it targetting compiler gets confused so thats why we downcast explicitly

     //     Admin ar1 = uc1; // compile time error provided assigning user type object in child class ar so compiler treats it as error
//        Admin ad =(Admin) new User();
       Admin ar = (Admin) uc1;
    }

    public Object getObject(String type)
    {
        Object obj =new Admin();
        return obj;
    }
}
