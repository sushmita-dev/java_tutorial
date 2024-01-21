package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // Input validation
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");

        while (true) {
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            if (isValidName(name)) {
                names.add(name);
            } else {
                System.out.println("Invalid name. Please enter alphabetic characters and whitespace only.");
            }
        }

        // Sorting in descending order
        Collections.sort(names, Collections.reverseOrder());

        // Displaying the sorted names
        System.out.println("\nSorted names in descending order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    // Validation method to check if the name contains only alphabetic characters and whitespace
    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
}
