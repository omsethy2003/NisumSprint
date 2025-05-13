class Parent {
    static void method() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    void callParent() {
        Parent.method();
    }

    public static void main(String[] args) {
        new Child().callParent();
    }
}
