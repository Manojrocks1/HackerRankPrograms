package Day6HR;

import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Taking scanner class
        System.out.println("Enter the number:");
        int N = scanner.nextInt(); // Taking(or) reading input

        int sum = 0;  // assigning sum variable with zeo
        for (int i = 1; i <= N; i++) {
            sum+= i * i;  // multiply with i variable and store it in sum variable
        }
        System.out.println("The sum of squares of number is:" +sum);
    }
}
