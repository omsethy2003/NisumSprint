public class Q9Student {
    private String name;
    private String address;
    private String section;
    private final String college = "Harvard University";
    private String className;
    private final int rollNo;
    private static int nextRollNo = 1;

    public Q9Student(String name, String address, String section, String className) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.className = className;
        this.rollNo = nextRollNo++;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Section: " + section);
        System.out.println("College: " + college);
        System.out.println("Class: " + className);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Q9Student s1 = new Q9Student("Om", "BBSR", "A", "COA");
        s1.displayInfo();
    }
}