package labs;
import java.util.Scanner;
import java.util.Arrays;

public class lab3 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A) Declare and Initialize arrays
        int[] oneDimArray = {1, 2, 3, 4, 5};  // Compile-time initialization
        int[][] twoDimArray = new int[3][3];   // Run-time initialization

        // Get values for two-dimensional array
        System.out.println("Enter values for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                while (!scanner.hasNextInt() || scanner.nextInt() < 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    scanner.next();  // Consume the invalid input
                }
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        // B) Display the array in ascending order
        Arrays.sort(oneDimArray);
        System.out.println("One-dimensional array in ascending order: " + Arrays.toString(oneDimArray));

        // Note: Sorting a 2D array requires flattening it first
        int[] flattenedArray = Arrays.stream(twoDimArray).flatMapToInt(Arrays::stream).toArray();
        Arrays.sort(flattenedArray);
        System.out.println("Two-dimensional array in ascending order: " + Arrays.toString(flattenedArray));

        // C) Validation: Ensure array elements are positive numbers
        for (int num : oneDimArray) {
            if (num < 0) {
                System.out.println("Invalid input in one-dimensional array. Positive numbers are required.");
                return;
            }
        }

        for (int[] row : twoDimArray) {
            for (int num : row) {
                if (num < 0) {
                    System.out.println("Invalid input in two-dimensional array. Positive numbers are required.");
                    return;
                }
            }
        }

        // Display the number of elements in the one-dimensional array
        System.out.println("Number of elements in the one-dimensional array: " + oneDimArray.length);

        // Display the two-dimensional array in matrix format
        System.out.println("Two-dimensional array in matrix format:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

}