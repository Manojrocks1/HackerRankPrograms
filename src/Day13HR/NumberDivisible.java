package Day13HR; // Package declaration

import java.util.Scanner; // Importing the Scanner class for user input

public class NumberDivisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object to take user input

        // Prompt the user to enter a number
        System.out.print("Enter a number:");
        int num = in.nextInt(); // Read the input number

        int x = num; // Create a copy of the input number for processing
        int rem = 0; // Variable to store the remainder when extracting digits
        int sum = 0; // Variable to store the sum of the digits of the number
        if(x < 0)
            x = x * (-1);
        // Loop to calculate the sum of the digits of the number
        while (x > 0) {
            rem = x % 10; // Extract the last digit of the number
            sum = sum + rem; // Add the digit to the sum
            x = x / 10; // Remove the last digit by dividing the number by 10
        }

        // Calculate the remainder when the original number is divided by the sum of its digits
        int r = num % sum;

        // Check if the number is divisible by the sum of its digits
        if (r == 0)
            System.out.println(num + " is a Harshad Number."); // Output if the number is a Harshad Number
        else
            System.out.println(num + " is not a Harshad Number."); // Output if the number is not a Harshad Number
    }
}
