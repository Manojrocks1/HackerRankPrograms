package Day8HR;

import java.util.Scanner;

class ListSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Variable declarations
        int i, j, k, check = 0;

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); // Read the number of elements

        // Create an array to store the elements
        System.out.print("Enter the elements: ");
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Read each element and store it in the array
        }

        // Prompt the user to enter the target sum
        System.out.print("Enter the target element: ");
        int t = sc.nextInt(); // Read the target sum

        // Nested loops to find two numbers in the array that sum up to the target
        for (j = 0; j < n - 1; j++) { // Outer loop
            for (k = j + 1; k < n; k++) { // Inner loop
                if (a[j] + a[k] == t) { // Check if the sum of a[j] and a[k] equals the target
                    check = 1; // Set check to 1 if such a pair is found
                    break; // Exit the inner loop
                }
            }
            if (check == 1) { // If a pair is found, exit the outer loop as well
                break;
            }
        }

        // Print the result based on whether a pair was found
        if (check == 1) {
            System.out.print("true"); // Print true if a pair is found
        } else {
            System.out.print("false"); // Print false if no pair is found
        }

        // Close the scanner to free resources
        sc.close();
    }
}