class SuperClass {
    void superMethod() {
        System.out.println("Superclass method");
    }
}

class SubClass extends SuperClass {
    void subMethod() {
        System.out.println("Subclass method");
    }
}

public class Q22SubClassExample {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.superMethod();
    }
}