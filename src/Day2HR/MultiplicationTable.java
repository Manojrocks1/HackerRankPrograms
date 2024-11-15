package Day2HR;

import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            printMultiplicationTable(n);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
