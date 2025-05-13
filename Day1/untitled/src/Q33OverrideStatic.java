class Parent1 {
    static void method() {
        System.out.println("Parent's method");
    }
}

class Child1 extends Parent1 {
    static void method() {
        System.out.println("Child's method");
    }
}

public class Q33OverrideStatic {
    public static void main(String[] args) {
        Parent.method();
        Child.method();

        Parent obj = new Child();
        obj.method();
    }
}