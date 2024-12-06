package Day13HR;
import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: height of the zigzag pattern
        System.out.print("Enter the height of the zigzag pattern: ");
        int n = scanner.nextInt();

        int start = 1; // Starting number for the pattern
        int end = 2 * n - 1; // Ending number for the pattern

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Print spaces before the first number
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print the two numbers in the current row
            System.out.print(start);

            if (start != end) {
                // Calculate spaces between the two numbers
                for (int j = 0; j < (2 * (n - i - 1) - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print(end);
            }

            System.out.println(); // Move to the next line

            start++; // Increment the start number
            end--; // Decrement the end number
        }
    }
}
