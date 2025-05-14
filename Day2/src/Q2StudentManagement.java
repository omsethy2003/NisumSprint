import java.util.ArrayList;

class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    class Student {
        int id;
        String name;
        String grade;

        Student(int id, String name, String grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }
    }

    public void addStudent(int id, String name, String grade) {
        students.add(new Student(id, name, grade));
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                break;
            }
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Student s : students) {
            System.out.println(s.id + ": " + s.name + " - " + s.grade);
        }
    }

    public static void main(String[] args) {
        StudentManagement s = new StudentManagement();
        s.addStudent(10, "Om", "O");
        s.addStudent(20, "Krishna", "E");
        s.displayAll();
        Student found = s.searchStudent(101);
        if (found != null) {
            System.out.println("Found: " + found.name);
        }
        s.removeStudent(10);
        s.displayAll();
    }
}