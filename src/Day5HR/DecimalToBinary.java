package Day5HR;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter the decimal number:");
        int n = sc.nextInt();

        // Convert the integer to its binary string representation using Integer.toBinaryString()
        String binary = Integer.toBinaryString(n);

        // Output the binary representation
        System.out.println(binary);

        sc.close(); // Close the Scanner to free resources
    }
}
