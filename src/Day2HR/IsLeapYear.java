package Day2HR;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year to check leap or not:");
        int year =sc.nextInt();
        if(year%4==0 && year%100!=0||year%400==0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
