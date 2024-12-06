package Day13HR;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Read the number of rows for the triangular pattern
        int n = sc.nextInt();

        // Outer loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to iterate through columns in the current row
            for (int j = 1; j <= i; j++) {
                // Conditions to determine when to print the number
                if (j == 1 || j == i || i == n) {
                    // Print the number if it's the first or last column of the row,
                    // or if it's the last row of the triangle
                    System.out.print(j + " ");
                } else {
                    // Print a blank space for the inner cells that are not edges
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
        }
    }
