package Day22HR;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        // Read the height of the rhombus
        int n = scanner.nextInt();

        // Print the upper part of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // Print the stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
