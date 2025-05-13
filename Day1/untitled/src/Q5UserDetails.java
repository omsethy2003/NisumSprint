public class Q5UserDetails {
    public String name;
    public String id;
    public String email;
    private String password;
    private String creditCard;
    private int creditCardBalance;

    public Q5UserDetails(String name, String id, String email, String password,
                         String creditCard, int balance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.creditCardBalance = balance;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Q5UserDetails user = new Q5UserDetails("Om", "793", "om@gmail.com",
                "777", "Kotak", 100);
        user.display();
    }
}
