package Day6HR;

import java.util.Scanner;

public class SquareRootCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int sqrt = (int) Math.sqrt(x);

        System.out.println(sqrt);
    }
}
