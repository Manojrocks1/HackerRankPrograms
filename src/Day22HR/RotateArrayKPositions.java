package Day22HR;

import java.util.Scanner;

public class RotateArrayKPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the number of positions to rotate
        int k = scanner.nextInt();

        // Adjust k to handle cases where k might be greater than n
        k %= n;

        // Rotate the array k positions to the right using a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
