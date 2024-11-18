package Day3HR;

import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int previous = nums[0];
        int lastIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous)
                continue;
            nums[lastIndex + 1] = nums[i];
            previous = nums[i];
            lastIndex++;
        }
        return lastIndex + 1;
    }
}