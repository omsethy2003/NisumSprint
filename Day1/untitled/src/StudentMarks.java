public class StudentMarks {
    private String college;
    private int rollNo;
    private int math;
    private int science;
    private int computer;

    public StudentMarks(String college, int rollNo, int math, int science, int computer) {
        this.college = college;
        this.rollNo = rollNo;
        this.math = math;
        this.science = science;
        this.computer = computer;
    }

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks("KIIT", 793, 99, 90, 100);
    }
}