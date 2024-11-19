package Day4HR;

import java.util.Scanner;

public class LCMOfTwo {
        static int gcd(int a, int b)
        {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        // method to return LCM of two numbers
        static int lcm(int a, int b)
        {
            return (a / gcd(a, b)) * b;
        }

        // Driver method
        public static void main(String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the 1st number:");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd number:");
            int b = sc.nextInt();
            System.out.println("LCM of " + a +
                    " and " + b +
                    " is " + lcm(a, b));
    }
}
