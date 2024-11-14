package Day1HR;

import java.util.Scanner;



    public class InvertedTriangle {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            // Print the right-aligned triangle
            for (int i = 1; i <= n; i++) { // Loop from 1 to n
                // Print spaces for alignment
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" "); // Print space
                }
                // Print stars
                for (int k = 1; k <= i; k++) {
                    System.out.print("*"); // Print star
                }
                // Move to the next line after each row
                System.out.println();


            }
        }
    }
