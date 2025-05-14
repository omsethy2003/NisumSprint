import java.util.TreeSet;

class EmployeeSystem {
    private TreeSet<Employee> employees = new TreeSet<>();

    class Employee implements Comparable<Employee> {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int compareTo(Employee other) {
            return this.name.compareTo(other.name);
        }
    }

    public void addEmployee(int id, String name, String department, double salary) {
        employees.add(new Employee(id, name, department, salary));
    }

    public void displayAll() {
        for (Employee e : employees) {
            System.out.println(e.name + " (" + e.id + ") - " + e.department + " - " + e.salary);
        }
    }

    public static void main(String[] args) {
        EmployeeSystem es = new EmployeeSystem();
        es.addEmployee(101, "Om", "Open-cast", 55000);
        es.addEmployee(102, "Ram", "UnderGround", 65000);
        es.displayAll();
    }
}