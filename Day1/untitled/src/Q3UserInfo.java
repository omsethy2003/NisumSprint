//Create user profile with basic information and
// print the user information after completion of creating the profile.

public class Q3UserInfo {
    private String name;
    private int age;
    private String city;
    private int salary;

    public Q3UserInfo(String name, int age, String city, int salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Q3UserInfo user = new Q3UserInfo("Om Sethy", 21, "BBSR", 10000);
        user.displayProfile();
    }
}