package Day20HR;

import java.util.Scanner;
public class Count012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Read the number of elements in the array
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();

// Create an array to store the elements
        int[] arr = new int[n];

// Read elements from the user and store them in the array
        System.out.println("Enter " + n + " elements (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

// Sort the array using the sortColors method
        sortColors(arr);

// Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    public static void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap elements at low and mid, increment both low and mid
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Element is already in the correct position, just move mid forward
                    mid++;
                    break;
                case 2:
                    // Swap elements at mid and high, decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}