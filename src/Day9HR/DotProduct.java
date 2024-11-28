package Day9HR;

import java.util.Scanner;

public class DotProduct {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        // Initialize a variable to store the dot product sum
        int sum = 0;

        // Declare an array to store the first set of numbers
        int[] arr = new int[n];

        // Loop to read the elements of the first array from the user
        System.out.print("Enter the elements of the first array (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the size of the second arrays (should be the same as the first)
        System.out.println("Enter the size of the second array (should be same as the first): ");
        int m = sc.nextInt();  // Here, m should ideally be n for dot product

        // Declare an array to store the second set of numbers
        int[] arr1 = new int[n];

        // Loop to read the elements of the second array from the user
        System.out.println("Enter the elements of the second array (space-separated): ");
        for (int j = 0; j < n; j++) {
            arr1[j] = sc.nextInt();
        }

        // Calculate the dot product by multiplying corresponding elements and adding them to the sum
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i] * arr1[i];
        }

        // Print the calculated dot product
        System.out.println("The dot product of the arrays is: " + sum);
    }
}