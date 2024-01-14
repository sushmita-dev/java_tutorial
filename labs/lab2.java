package labs;

import java.util.Scanner;

public class lab2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Student Details:");

        String regNo = getRegNoInput("Registration Number (4 digits and 2 alphabets): ");
        String name = getAlphabeticInput("Name: ");
        int age = getAgeInput("Age: ");
        double gpa = getDoubleInput("GPA: ");
        long phoneNumber = getPhoneNumberInput("Phone Number: ");

        displayStudentDetails(regNo, name, age, gpa, phoneNumber);
    }

    private static String getRegNoInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.length() == 6 && input.substring(0, 4).matches("[0-9]+") && input.substring(4).matches("[a-zA-Z]+") && !input.contains(" ")) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter 4 digits followed by 2 alphabets (no spaces).");
            }
        }
    }

    private static String getAlphabeticInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("^[a-zA-Z\\s]+$")) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter alphabetic characters only.");
            }
        }
    }
    

    private static int getAgeInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("^[0-9]+$")) {
                int age = Integer.parseInt(input);
                if (age >= 0 && age < 30) {
                    return age;
                } else {
                    System.out.println("Invalid input. Please enter a valid age (less than 30).");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("^[0-9]+(\\.[0-9]+)?$")) {
                return Double.parseDouble(input);
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
            }
        }
    }

    private static long getPhoneNumberInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("^[0-9]{10}$")) {
                return Long.parseLong(input);
            } else {
                System.out.println("Invalid input. Please enter a 10-digit numeric phone number.");
            }
        }
    }

    private static void displayStudentDetails(String regNo, String name, int age, double gpa, long phoneNumber) {
        System.out.println("\nStudent Details:");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
