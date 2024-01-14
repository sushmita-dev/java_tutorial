package labs;
import java.util.Scanner;

public class studentdetails {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Registration Number: ");
        String regNumber = scanner.nextLine();

        String name;
        while (true) {
            System.out.print("Enter Student Name: ");
            name = scanner.nextLine();
            if (!name.matches("[0-9]+")) {  // Check if the name contains digits
                break;
            }2
            System.out.println("Invalid name. Please enter a valid name without numbers.");
        }

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        
        long phoneNumber;
        while (true) {
            System.out.print("Enter Student Phone Number: ");
            phoneNumber = scanner.nextLong();
            if (String.valueOf(phoneNumber).length() == 10) {  // Check if phone number has 10 digits
                break;
            }
            System.out.println("Invalid phone number. Please enter a 10-digit phone number.");
        }

        // Display Information
        System.out.println("\nStudent Information:");
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);

        // Close the scanner
        scanner.close();
    }
}

    
