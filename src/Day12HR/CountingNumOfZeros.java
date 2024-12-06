package Day12HR;

import java.util.Scanner;

public class CountingNumOfZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Create a Scanner object to read input from the console
        System.out.println("Enter the number to count zeros:");
        int n = s.nextInt();                   // Read an integer value from the user and store it in 'n'

        int count = 0;                          // Initialize a variable 'count' to keep track of trailing zeros

// Check for the special case where the input is exactly 0
        if (n == 0) {
            System.out.println(1);                // Print 1 because a single zero has one trailing zero
        } else {
            // Loop until the number becomes zero (i.e., all digits are processed)
            while (n > 0) {
                // Check if the last digit of the current number is 0
                if (n % 10 == 0) {
                    count++;                           // Increment 'count' if the last digit is 0
                }
                // Remove the last digit by dividing the number by 10
                n = n / 10;                           // Update 'n' to remove the processed digit
            }
        }

// Print the final count of trailing zeros
        System.out.println(count);
    }
}
