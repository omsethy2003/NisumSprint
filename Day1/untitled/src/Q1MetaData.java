public class Q1MetaData {
    public static void main(String[] args) {
        Integer num = 10;
        Class<?> n = num.getClass();

        System.out.println("Class Name: " + n.getName());
        System.out.println("Simple Name: " + n.getSimpleName());
        System.out.println("Interface: " + n.isInterface());
    }
}
