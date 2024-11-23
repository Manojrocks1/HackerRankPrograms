package Day8HR;

import java.util.Scanner;

public class Coprime {

    // Method to check if two numbers are coprime
    public static boolean isCoprime(int a, int b) {
        // Iterate from 2 up to the smaller of the two numbers (inclusive)
        for (int i = 2; i <= a && i <= b; i++) {
            // If 'i' is a common factor of both 'a' and 'b', they are not coprime
            if (a % i == 0 && b % i == 0) {
                return false; // Return false as they are not coprime
            }
        }
        // If no common factor other than 1 is found, return true
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scr = new Scanner(System.in);

        // Read two integers from the user
        int a = scr.nextInt(); // First number
        int b = scr.nextInt(); // Second number

        // Call the isCoprime method and print the result
        System.out.println(Coprime.isCoprime(a, b));

        // Close the Scanner to free resources
        scr.close();
    }
}