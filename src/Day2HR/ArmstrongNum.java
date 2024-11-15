package Day2HR;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int nod=0, dup =n, sum = 0;
        while(n > 0){
            nod += 1;
            n /=10;
        }
        n = dup;
        //Raise each digit of the number to the power of number of digits.
        while(n > 0){
            sum += Math.pow(n%10, nod);
            n/=10;
        }
        if(sum == dup)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
