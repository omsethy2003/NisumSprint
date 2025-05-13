public class Q8StaticBlock {
    static {
        System.out.println("Static block executed before main");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}