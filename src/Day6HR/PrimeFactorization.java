package Day6HR;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        int mul = 2;
        int temp = a;
        for (int i = 2; i <= a; i++) {
            while (temp % i == 0) {
                temp = temp / i;
                System.out.println(i);
            }
        }
    }
}