package labs;

// Main class - is of restaurant
public class lab1 {
    public static void main(String[] args) {
        
        MenuItem menuItem1 = new MenuItem();
        menuItem1.initialize("Pizza", 12.99, 800, "Main Course", false, true, true);

        MenuItem menuItem2 = new MenuItem();
        menuItem2.initialize("Burger", 8.50, 600, "Main Course", true, false, true);

        displayMenuItemDetails(menuItem1);
        displayMenuItemDetails(menuItem2);

        double totalCalories = menuItem1.getCalories() + menuItem2.getCalories();
        System.out.println("\nTotal Calories in both items: " + totalCalories);

        double totalPrice = menuItem1.getPrice() + menuItem2.getPrice();
        System.out.println("\nTotal Price of both items: " + totalPrice);
    }

    public static void displayMenuItemDetails(MenuItem item) {
        System.out.println("\nName: " + item.getName());
        System.out.println("Price: Rs" + item.getPrice());
        System.out.println("Calories: " + item.getCalories());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Is Vegetarian: " + item.isVegetarian());
        System.out.println("Is Spicy: " + item.isSpicy());
        System.out.println("Is Available: " + item.isAvailable());
    }
}

// MenuItem class
class MenuItem {
    private String name;
    private double price;
    private int calories;
    private String category;
    private boolean isVegetarian;
    private boolean isSpicy;
    private boolean isAvailable;

    public void initialize(String name, double price, int calories, String category, boolean isVegetarian, boolean isSpicy, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isSpicy = isSpicy;
        this.isAvailable = isAvailable;
    }

    // Getter methods (unchanged)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getCategory() {
        return category;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
