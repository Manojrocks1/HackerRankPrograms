package Day1HR;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        for (; n > 0; ) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (a == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
