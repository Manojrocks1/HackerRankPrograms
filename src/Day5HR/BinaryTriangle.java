package Day5HR;
import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j+1)%2+" ");

            }
            System.out.println();
        }
    }
}
