public class Q13ExecutionOrder {
    static {
        System.out.println("Static block execution");
    }

    static void staticMethod() {
        System.out.println("Static method execution");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        staticMethod();
    }
}