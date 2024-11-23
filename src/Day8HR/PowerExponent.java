package Day8HR;

import java.util.Scanner;

public class PowerExponent {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the base value
        System.out.println("Enter the base:");
        int x = sc.nextInt(); // Read the base value

        // Prompt the user to enter the exponent (power) value
        System.out.println("Enter the power:");
        int n = sc.nextInt(); // Read the exponent value

        int res = 1; // Variable to store the result, initialized to 1 (multiplicative identity)

        // Calculate the power using a for loop
        for (int i = 0; i < n; i++) {
            res = x * res; // Multiply the result by the base 'x' in each iteration
        }

        // Print the result
        System.out.println(x + " raised to the power of " + n + " is: " + res);

        // Close the scanner to free resources
        sc.close();
    }
}