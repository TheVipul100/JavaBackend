package StudentManagementSystem;

public class Driver {
    public static void main(String[] args) {
        IStudentManagement studClass = new Student("vipul");
        System.out.println(studClass.studentMarking(100,58));


        System.out.println(IStudentManagement.lunchPeriod("lunch time"));

        IStudentManagement studClass1 = new Teacher();
        System.out.println(studClass1.studentMarking(100,79));

        System.out.println(studClass1.attendance("vipul"));

        Student stud =  new Student("vipul");
        stud.feePayment();
    }
}
