package StudentManagementSystem;

public class Admin implements IStudentManagement{

    String admin = "Rahul";  // particular admin in the school

    @Override
    public String attendance(String name) {
        if(admin.equals(name))
         return "present";

        return "absent";
    }

    public static void lunchTime()
    {
        System.out.println(IStudentManagement.lunchPeriod("halftime"));
    }
}
