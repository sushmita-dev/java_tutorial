package labs;

// Main class - is of restaurant
public class lab1 {
    
    public static void main(String[] args) {
        //Creating instance of MenuItem class by calling constructor MenuItem.
        MenuItem menuItem1 = new MenuItem("Pizza", 12.99, 800);
        MenuItem menuItem2 = new MenuItem("Burger", 8.50, 600);
        
        //Printing separate properties of the instance/object by calling methods
        System.out.println("Menu Item 1: " + menuItem1.getName() + ", Price: $" + menuItem1.getPrice() + ", Calories: " + menuItem1.getCalories());
        System.out.println("Menu Item 2: " + menuItem2.getName() + ", Price: $" + menuItem2.getPrice() + ", Calories: " + menuItem2.getCalories());
        
        double totalCalories = menuItem1.getCalories() + menuItem2.getCalories();
        System.out.println("Total Calories in both items: " + totalCalories);
    }
}

// MenuItem class
class MenuItem {
    //Properties
    String name;
    double price;
    int calories;
    String category;
    boolean isVegetarian;
    boolean isSpicy;
    boolean isAvailable;

    //Constructor - Parametarized
    public MenuItem(String name, double price, int calories) {
        //initializing the object
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.category = "Main Course";
        this.isVegetarian = false;
        this.isSpicy = false;
        this.isAvailable = true;
    }

    // Method 1
    public String getName() {
        return name;
    }

    // Method 2
    public double getPrice() {
        return price;
    }

    // Method 3
    public int getCalories() {
        return calories;
    }
}
