package Day5HR;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String binaryString = scanner.nextLine();

        int decimal = 0,power = 0;

        // Iterate through the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);

            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;

        }

        System.out.println(decimal);
    }
}
