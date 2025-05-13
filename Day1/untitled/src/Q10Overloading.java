public class Q10Overloading {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }


    public static void main(String[] args) {
        Q10Overloading obj = new Q10Overloading();
        obj.add(10,20);
        obj.add(2.2,2.5);
    }
}
