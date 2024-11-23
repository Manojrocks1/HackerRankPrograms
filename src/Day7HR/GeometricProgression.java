package Day7HR;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a = sc.nextInt();
        System.out.println("Enter the d value:");
        int d = sc.nextInt();
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + a;
            a = a + d;

        }
        System.out.println(sum);

    }
}
