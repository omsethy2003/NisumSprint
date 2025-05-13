class Nisum {
    String company = "Nisum";
    int establishedYear = 2000;
}

class Employee extends Nisum {
    String employeeName;

    void display() {
        System.out.println(employeeName + " works at " + company);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.employeeName = "Om";
        emp.display();
    }
}
