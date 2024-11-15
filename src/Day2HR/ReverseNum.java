package Day2HR;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        int rev =0 , rem;
        while (num > 0) {

            rem = num % 10;
            rev = rem + rev * 10;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
