package Day4HR;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements to be sorted:");

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.print(isSorted);
    }

}
