import java.util.*;

class RestaurantMenu {
    private LinkedHashMap<String, HashMap<String, MenuItem>> menu = new LinkedHashMap<>();

    class MenuItem {
        String name;
        String description;
        double price;

        MenuItem(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }
    }

    public void addCategory(String category) {
        if (!menu.containsKey(category)) {
            menu.put(category, new HashMap<>());
        }
    }

    public void addItem(String category, String name, String description, double price) {
        addCategory(category);
        menu.get(category).put(name, new MenuItem(name, description, price));
    }

    public void displayMenu() {
        for (Map.Entry<String, HashMap<String, MenuItem>> categoryEntry : menu.entrySet()) {
            System.out.println("\n" + categoryEntry.getKey().toUpperCase() + ":");
            for (Map.Entry<String, MenuItem> itemEntry : categoryEntry.getValue().entrySet()) {
                MenuItem item = itemEntry.getValue();
                System.out.printf("%s - %s ($%.2f)\n", item.name, item.description, item.price);
            }
        }
    }

    public static void main(String[] args) {
        RestaurantMenu rm = new RestaurantMenu();
        rm.addItem("Appetizer", "Bruschetta", "Toasted bread with toppings", 6.99);
        rm.addItem("Main Course", "Pasta", "Spaghetti with marinara sauce", 12.99);
        rm.addItem("Dessert", "Tiramisu", "Coffee-flavored Italian dessert", 7.99);
        rm.displayMenu();
    }
}