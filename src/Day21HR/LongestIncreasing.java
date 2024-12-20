package Day21HR;

import java.util.Scanner;

public class LongestIncreasing {
    public static int longestIncreasingContinuousSubarray(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1; // At least one element is there
        int currentLength = 1; // Start with the first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++; // Increase length if current element is greater
            } else {
                maxLength = Math.max(maxLength, currentLength); // Update max length
                currentLength = 1; // Reset for new subarray
            }
        }

        // Final check to update maxLength in case the longest subarray ends at the last element
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " space-separated integers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = longestIncreasingContinuousSubarray(nums);

        System.out.println("The length of the longest increasing continuous subarray is: " + result);

        scanner.close();
    }
}
