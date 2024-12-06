package Day13HR;
import java.util.Scanner;
public class SubArraysCount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        // Initialize the array with the given size
        int[] array = new int[n];

        // Read the array elements from the user
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Initialize a counter to keep track of subarrays with a sum of zero
        int count = 0;

        // Outer loop: Start from each element in the array
        for (int i = 0; i < n; i++) {
            // Initialize the sum for the current subarray
            int sum = 0;

            // Inner loop: Calculate the sum of subarrays starting from index 'i'
            for (int j = i; j < n; j++) {
                sum += array[j]; // Add the current element to the sum

                // Check if the sum of the current subarray equals zero
                if (sum == 0) {
                    count++; // Increment the counter
                }
            }
        }

        // Print the total count of subarrays with a sum of zero
        System.out.println("Number of subarrays with sum zero: " + count);
    }
}
