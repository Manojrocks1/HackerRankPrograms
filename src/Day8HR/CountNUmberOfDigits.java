package Day8HR;

import java.util.Scanner;

public class CountNUmberOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the digits: ");
        int num = scanner.nextInt(); // Read the input number
        int count = 0; // Variable to store the count of digits

        // Special case: If the number is 0, it has exactly one digit
        if (num == 0) {
            System.out.println(1); // Directly print 1 as the count of digits
        } else {
            // Loop to count the digits
            while (num != 0) {
                num /= 10; // Remove the last digit of the number
                count++;   // Increment the digit count
            }

            // Print the total number of digits in the input
            System.out.println("Count of given digits is: " + count);
        }

        // Close the scanner to free resources
        scanner.close();
    }
}