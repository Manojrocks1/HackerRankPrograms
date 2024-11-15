package Day2HR;

import java.util.Scanner;

public class SwapWithoutVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st variable:");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd variable:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a+" "+b);
    }
}
