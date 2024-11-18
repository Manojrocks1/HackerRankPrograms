package Day3HR;

import java.util.Scanner;

public class ReverseElements {
    public static void main(String[] args) {

                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.print("Enter the elements of integers in array form:");

                int[] arr =new int[n];
                for(int i=0;i<n;i++)
                    arr[i] = sc.nextInt();

                // In-place reversal of array
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
