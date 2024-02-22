import java.util.Calendar;
import java.util.Scanner;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private int yearOfPublication;
    private double price;
    private int quantity;
    private double amount;

    // Default constructor
    public Book() {
        this.title = "Java Programming"; // Default title
    }

    // Constructor accepting author, ISBN, and year of publication
    public Book(int bookId, String author, String isbn, int yearOfPublication) {
        this(); // Call default constructor
        this.bookId = bookId;
        this.author = author;
        this.isbn = isbn;
        this.yearOfPublication = yearOfPublication;
    }

    // Constructor accepting price and quantity, calculates amount
    public Book(int bookId, double price, int quantity) {
        this(); // Call default constructor
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
        this.amount = price * quantity;
    }

    // Method to calculate and return the age of the book based on the current year
    public int calculateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfPublication;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("----------------------------------");
        System.out.println("Book Details");
        System.out.println("----------------------------------");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("ISBN No: " + isbn);
        System.out.println("Name of Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Price of Book: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Amount: %.2f\n", amount);
        int age = calculateAge();
        System.out.println("Age of the Book: " + age + " years");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user for Book 1
        System.out.println("\nEnter details for the first book:");

        // Getting input from the user for Book ID
        int bookId;
        while (true) {
            System.out.print("Enter Book ID: ");
            String input = scanner.nextLine();
            try {
                bookId = Integer.parseInt(input);
                if (bookId <= 0) {
                    System.out.println("Book ID should be a positive integer.");
                    continue;
                }
                break; // If input is valid, break the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid Book ID.");
            }
        }

        // Getting input from the user for Book details
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter ISBN No: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter Year of Publication: ");
        int yearOfPublication = scanner.nextInt();

        System.out.print("Enter Price of Book: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Create Book object for Book 1
        Book book1 = new Book(bookId, author, isbn, yearOfPublication);
        book1.setTitle(title);
        book1.setPrice(price);
        book1.setQuantity(quantity);

        // Display book details for Book 1
        System.out.println("\nDisplaying details of the first book:");
        book1.displayBook();

        // Getting input from the user for Book 2
        System.out.println("\nEnter details for the second book:");

        // Getting input from the user for Book ID
        while (true) {
            System.out.print("Enter Book ID: ");
            String input = scanner.nextLine();
            try {
                bookId = Integer.parseInt(input);
                if (bookId <= 0) {
                    System.out.println("Book ID should be a positive integer.");
                    continue;
                }
                break; // If input is valid, break the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid Book ID.");
            }
        }

        // Getting input from the user for Book details
        System.out.print("Enter Title: ");
        title = scanner.nextLine();

        System.out.print("Enter Author: ");
        author = scanner.nextLine();

        System.out.print("Enter ISBN No: ");
        isbn = scanner.nextLine();

        System.out.print("Enter Year of Publication: ");
        yearOfPublication = scanner.nextInt();

        System.out.print("Enter Price of Book: ");
        price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = scanner.nextInt();

        // Create Book object for Book 2
        Book book2 = new Book(bookId, author, isbn, yearOfPublication);
        book2.setTitle(title);
        book2.setPrice(price);
        book2.setQuantity(quantity);


        
        System.out.println("\nDisplaying details of the first book:");
        book1.displayBook();
        // Display book details for Book 2
        System.out.println("\nDisplaying details of the second book:");
        book2.displayBook();

        scanner.close();
    }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.amount = price * quantity; // Recalculate amount when quantity is set
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}