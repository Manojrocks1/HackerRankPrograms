package Day5HR;
import java.util.Scanner;
public class OddNumberPyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = scanner.nextInt();

            int num = 1;

            for (int i = 1; i <= n; i++) {
                // Print spaces for centering
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print odd numbers in the row
                for (int j = 1; j <= i; j++) {
                    System.out.print(num+" ");
                    num += 2;
                }

                System.out.println();
            }
        }
    }
