package Day13HR;

import java.util.Scanner;

public class LargestSmallestDiff {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        // Convert the number to its absolute value to handle negatives
        n = Math.abs(n);

        int largest = Integer.MIN_VALUE; // Start with the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Start with the largest possible integer

        // Process each digit
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            largest = Math.max(largest, digit); // Update the largest digit
            smallest = Math.min(smallest, digit); // Update the smallest digit
            n /= 10; // Remove the last digit
        }

        // Calculate the difference
        int difference = largest - smallest;

        // Output the result
        System.out.println("Difference between largest and smallest digit: " + difference);
    }
    }
