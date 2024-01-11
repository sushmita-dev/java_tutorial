package labs;

// MenuItem class
class MenuItem {
    String itemName;
    double itemPrice;

    void display() {
        System.out.println("Item: " + itemName + ", Price: $" + itemPrice);
    }

    double tax() {
        return 0.1 * itemPrice;
    }
}

// Lab1 class
public class Lab1 {
    public static void main(String[] args) {
        MenuItem dish = new MenuItem();
        dish.itemName = "Spaghetti";
        dish.itemPrice = 12.99;

        System.out.println("Restaurant: Pasta Palace, Cuisine: Italian");
        dish.display();
        System.out.println("Tax: $" + dish.tax());
    }
}
