final class FinalClass {
    void display() {
        System.out.println("This class cannot be extended");
    }
}

public class Q32FinalUse {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}