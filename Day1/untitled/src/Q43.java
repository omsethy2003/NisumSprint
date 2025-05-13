//How to check if a String contains only digits?


public class Q43 {
    public static void main(String[] args) {
        String n1 = "12345";
        String n2 = "123a45";

        System.out.println(n1 + " contains only digits: " + n1.matches("\\d+"));
        System.out.println(n2 + " contains only digits: " + n2.matches("\\d+"));
    }
}
