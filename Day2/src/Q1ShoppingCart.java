import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<Item> cart = new ArrayList<>();

    class Item {
        String name;
        int price;
        int quantity;

        Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public void addItem(String name, int price, int quantity) {
        cart.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).name.equals(name)) {
                cart.remove(i);
                break;
            }
        }
    }

    public void viewCart() {
        for (Item item : cart) {
            System.out.println(item.name + " - " + item.price + " x" + item.quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.price * item.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Maggi", 200, 3);
        cart.addItem("Biscuit", 250, 1);
        cart.viewCart();
        System.out.println("Total: " + cart.calculateTotal());
        cart.removeItem("Apple");
        cart.viewCart();
    }
}