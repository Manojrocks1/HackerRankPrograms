package Day1HR;

import java.util.Scanner;

public class IsPrime {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number to check prime or not:");
            int number= sc.nextInt();
            if(isPrime(number)) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        static  boolean isPrime(int num)
        {
            if(num<=1)
            {
                return false;
            }
            for(int i=2;i<=num/2;i++)
            {
                if((num%i)==0)
                    return  false;
            }
            return true;
        }
    }

