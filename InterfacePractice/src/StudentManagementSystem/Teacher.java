package StudentManagementSystem;

public class Teacher implements IStudentManagement{


    Student obj = new Student("vipul");

    @Override
    public String attendance(String nam) {
        if(obj.name.equals(nam)) {
            System.out.println(nam + " is present");
            return "present";
        }
        return "absent";
    }

    @Override
    public String studentMarking(int totalMarks, int marking) {
        // pass the real arguments through to the interface default
        return IStudentManagement.super.studentMarking(totalMarks, marking);
    }
}
