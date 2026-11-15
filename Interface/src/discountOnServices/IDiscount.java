package discountOnServices;


// before java 7 or 1.7 version
public interface IDiscount {
     int calculateDiscount(int amount,int rate);
    //public abstract in interface java by default set it as public and abstract

    public abstract void calculateDiscountTax(int tax);
}

/**
 *
 * an interface is a blueprint for classes
 * Advan.
 *  1.uniformity/consistency  --->interface method is implemented in every child class with its own behavioral change
 *  based on the method defined in the interface---->u cannot change the arguments type, order,number as its overriden
 *  2.loosely coupled as a change in interface will force to implement in the classes
 * <p>
 *
 *  in interface : default : variables act as constant---> (public static final) cannot have instance variable
 *  cannot declare a variable inside interface as it's an idea or a thought
 * <p>
 *  what's needed to be done---->interface and how it is done or decided -------> (implementation)  classes.
 *
 */