package StudentManagementSystem;

// IFeePayment already extends IStudentManagement, so listing both would be redundant
public class Student implements IFeePayment{

    public final String name ;
    public Student(String name) {
        if(name==null || name.isBlank())
            throw new IllegalArgumentException("Unknown individual");
        this.name = name;
    }
    public String getName()
    {
        return name;
    }


    @Override
    public String attendance(String nam) {
        if (name.equals(nam)) {
            return "present";
        }
        return "absent";
    }

    @Override
    public void sportsperiod() {
        IFeePayment.super.sportsperiod();   // calls the default method of the interface
    }

    // studentMarking() is not overridden: the default from IStudentManagement is used as it is


    public void lunchTime()
    {
        System.out.println(IStudentManagement.lunchPeriod("halftime"));
    }

    @Override
    public void feePayment() {
        System.out.println("Pay fee: 30000");
    }
}
