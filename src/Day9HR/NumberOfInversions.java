package Day9HR;

import java.util.Scanner;

public class NumberOfInversions {

    /**
     * This method calculates the number of inversions in an array.
     * An inversion occurs when a[i] is greater than a[j] for i < j.
     *
     * @param a The array to analyze
     * @param n The size of the array
     * @return The number of inversions in the array
     */
    public static int numberOfInversions(int[] a, int n) {
        // Initialize a counter to store the number of inversions
        int cnt = 0;

        // Nested loops to iterate through all pairs of elements in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the current element (a[i]) is greater than the next element (a[j])
                if (a[i] > a[j]) {
                    // Increment the counter if an inversion is found
                    cnt++;
                }
            }
        }

        // Return the total number of inversions found
        return cnt;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Declare an array to store the elements
        int[] a = new int[n];
        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        // Call the numberOfInversions method to calculate the inversion count
        int cnt = numberOfInversions(a, n);

        // Print the calculated number of inversions
        System.out.println("The number of inversions in the array is: " + cnt);
    }
}