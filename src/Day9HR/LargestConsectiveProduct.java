package Day9HR;

import java.util.Scanner;

public class LargestConsectiveProduct {
        public static void main(String[] args) {
            // Create a scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Read the size of the array
            int n = scanner.nextInt();

            // Check if the array has fewer than 2 elements
            if (n < 2) {
                System.out.println("Error: A pair cannot be formed.");
                return;
            }

            // Create an array to store the input numbers
            int[] nums = new int[n];

            // Read the elements of the array
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            // Initialize the maximum product as a very small number (or first pair product)
            int maxProduct = Integer.MIN_VALUE;

            // Loop through the array and calculate the product of each pair of consecutive elements
            for (int i = 0; i < n - 1; i++) {
                int product = nums[i] * nums[i + 1]; // Calculate product of consecutive elements
                maxProduct = Math.max(maxProduct, product); // Update the maximum product if needed
            }

            // Print the largest product found
            System.out.println(maxProduct);
        }
    }
