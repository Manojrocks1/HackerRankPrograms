package Day5HR;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter the decimal number:");
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(n>0){
            sb.append(n%2);
            n = n/2;
        }
        System.out.println(sb.reverse());
        sc.close(); // Close the Scanner to free resources
    }
}
