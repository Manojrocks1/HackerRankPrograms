package Day12HR;

import java.util.Scanner;

public class RemWithoutMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int remainder = calculateRemainder(a, b);
        System.out.println(remainder);
    }

    public static int calculateRemainder(int a, int b) {
        // Handle the case where a is smaller than b
        if (a < b) {
            return a;
        }

        // Repeatedly subtract b from a until a becomes less than b
        while (a >= b) {
            a -= b;
        }

        return a;
    }
}
