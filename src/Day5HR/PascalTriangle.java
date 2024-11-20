package Day5HR;

import java.util.Scanner;

public class PascalTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            int i,j;
            for(i = 1;i<=n;i++){
                for(j =1;j<=n-i;j++){
                    System.out.print(" ");

                }
                int val =1;
                for(j =1;j<=i;j++){
                    System.out.print(val+" ");
                    val = val * (i-j)/j;
                }
                System.out.println();
            }
        }
    }
