package Day12HR;

import java.util.Scanner;

public class CollatzSequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            // Print the starting number
            System.out.print(n + " ");

            // Generate the Collatz sequence
            while (n != 1) {
                if (n % 2 == 0) {
                    // If n is even, divide by 2
                    n = n / 2;
                } else {
                    // If n is odd, multiply by 3 and add 1
                    n = 3 * n + 1;
                }
                System.out.print(n + " ");
            }
        }
    }
