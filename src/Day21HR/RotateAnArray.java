package Day21HR;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");

        // Read the size of the array
        int n = scanner.nextInt();

        // Create an array to store the elements
        System.out.print("Enter the array of integers:");
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Rotate the array to the right by 1 step
        int lastElement = arr[n - 1]; // Store the last element
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0] = lastElement; // Assign the last element to the first position

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print("After rotating the array is: "+ arr[i] + " ");
        }
    }
}
