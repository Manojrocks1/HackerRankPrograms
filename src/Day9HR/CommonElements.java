package Day9HR;

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the first array from the user
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();

        // Declare and initialize variables for iterating through arrays
        int i = 0, j = 0;

        // Declare an array to store the first set of elements
        int[] a = new int[n];

        // Get the elements of the first array from the user
        System.out.println("Enter the elements of the first array (space-separated): ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Get the size of the second array from the user
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();

        // Declare an array to store the second set of elements
        int[] b = new int[m];

        // Get the elements of the second array from the user
        System.out.println("Enter the elements of the second array (space-separated): ");
        for (j = 0; j < m; j++) {
            b[j]  = sc.nextInt();
        }

        // Loop to find common elements in both arrays
        i = 0;
        j = 0;
        while (i < n && j < m) {
            // Check if elements at current positions are equal
            if (a[i] == b[j]) {
                // Print the common element
                System.out.println(a[i]);  // Can print either a[i] or b[j] as they are equal
                // Move both pointers to the next elements
                i++;
                j++;
            } else {
                // If elements are not equal, advance the pointer of the smaller element
                while (i < n && a[i] < b[j]) {
                    i++;
                }
                while (j < m && i < n && b[j] < a[i]) {
                    j++;
                }
            }
        }
    }
}