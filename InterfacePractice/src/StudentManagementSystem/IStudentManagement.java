package StudentManagementSystem;

public interface IStudentManagement {

    public abstract String attendance(String name);
    public default void sportsperiod(){
        System.out.println("Games Period");
    }

    public default String studentMarking(int totalMarks,int marking){
        return percentage(totalMarks, marking) >= 50 ? "pass" : "fail";
    }

    static String lunchPeriod(String halftime){
        return halftime;
    }

    // private helper (Java 9): used by studentMarking(), not visible to implementing classes
    private double percentage(int totalMarks, int marking)
    {
        if (totalMarks <= 0) {
            throw new IllegalArgumentException("totalMarks must be positive");
        }
        return marking * 100.0 / totalMarks;
    }


}
