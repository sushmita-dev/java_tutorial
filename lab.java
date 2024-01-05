public class lab {
    public static void main(String[] args) {
        // Create a Restaurant object
        Restaurant restaurant = new Restaurant("Tasty Bites", "123 Main St", 50, 4.5, 10000.0, 500);

        // Display properties and methods of the Restaurant
        System.out.println("Restaurant Name: " + restaurant.getName());
        System.out.println("Location: " + restaurant.getLocation());
        System.out.println("Average Cost Per Person: $" + restaurant.calculateAvgCostPerPerson());

        // Create a MenuItem object
        MenuItem menuItem = new MenuItem("Chicken Tikka", "Grilled chicken with spices", 15.99);

        // Display properties and methods of the MenuItem
        System.out.println("\nMenu Item Name: " + menuItem.getItemName());
        System.out.println("Description: " + menuItem.getDescription());
        System.out.println("Price: $" + menuItem.getPrice());
        System.out.println("Sales Tax: $" + menuItem.calculateSalesTax());
    }
}

class Restaurant {
    private String name;
    private String location;
    private int numberOfSeats;
    private double rating;
    private double revenue;
    private int numberOfCustomers;

    // Constructor
    public Restaurant(String name, String location, int numberOfSeats, double rating, double revenue, int numberOfCustomers) {
        this.name = name;
        this.location = location;
        this.numberOfSeats = numberOfSeats;
        this.rating = rating;
        this.revenue = revenue;
        this.numberOfCustomers = numberOfCustomers;
    }

    // Method to calculate average cost per person
    public double calculateAvgCostPerPerson() {
        if (numberOfCustomers != 0) {
            return revenue / numberOfCustomers;
        } else {
            return 0;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

class MenuItem {
    private String itemName;
    private String description;
    private double price;

    // Constructor
    public MenuItem(String itemName, String description, double price) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }

    // Method to calculate sales tax for the menu item (Assuming 5% sales tax)
    public double calculateSalesTax() {
        return 0.05 * price;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
