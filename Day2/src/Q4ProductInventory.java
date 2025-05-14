import java.util.HashMap;

class ProductInventory {
    private HashMap<String, Integer> inventory = new HashMap<>();

    public void addProduct(String name, int quantity) {
        if (inventory.containsKey(name)) {
            inventory.put(name, inventory.get(name) + quantity);
        } else {
            inventory.put(name, quantity);
        }
    }

    public void updateQuantity(String name, int newQuantity) {
        inventory.put(name, newQuantity);
    }

    public void removeProduct(String name) {
        inventory.remove(name);
    }

    public boolean isInStock(String name) {
        return inventory.containsKey(name) && inventory.get(name) > 0;
    }

    public void displayInventory() {
        for (String name : inventory.keySet()) {
            System.out.println(name + ": " + inventory.get(name));
        }
    }

    public static void main(String[] args) {
        ProductInventory pi = new ProductInventory();
        pi.addProduct("Laptop", 5);
        pi.addProduct("Mouse", 10);
        pi.displayInventory();
        pi.updateQuantity("Laptop", 3);
        System.out.println("Is Mouse in stock? " + pi.isInStock("Mouse"));
        pi.removeProduct("Mouse");
        pi.displayInventory();
    }
}