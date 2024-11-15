package Day2HR;

import java.util.Scanner;

public class FindSumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to sum individual digits:");
        int number = sc.nextInt();
        //calling the user-defined method and prints the result
        System.out.println(findSum(number));
    }

    static int findSum(int number)
    {
//variable that stores the sum
        int sum = 0;
//executes until the condition becomes false
        while (number != 0)
        {
//finds the last digit from the number and add it to the variable sum
            sum = sum + number % 10;
//removes the last digit
            number = number/10;
        }
//returns the sum
        return sum;
    }
}
