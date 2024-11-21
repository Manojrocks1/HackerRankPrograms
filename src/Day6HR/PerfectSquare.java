package Day6HR;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Taking scanner class


        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();  //Taking the input from user


        boolean isPerfectSquare = isPerfectSquare(n); // calling the function

        if (isPerfectSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);  // storing the value of square root into sqrt variable
        return sqrt * sqrt == n;  // comparing sqrt value and given number
    }
    }
