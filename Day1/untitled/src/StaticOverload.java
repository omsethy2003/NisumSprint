public class StaticOverload {
    static void display() {
        System.out.println("No arguments");
    }

    static void display(int num) {
        System.out.println("Integer: " + num);
    }

    static void display(String str) {
        System.out.println("String: " + str);
    }

    static void display(int num1, int num2) {
        System.out.println("Two integers: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        display();
        display(10);
        display("Hello");
        display(5, 7);
    }
}