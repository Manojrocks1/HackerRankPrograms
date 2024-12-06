package Day10HR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurenceMap {
    public static int countOccurrences(int[] arr, int target) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the map with element frequencies
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Return the frequency of the target element, or 0 if not present
        return frequencyMap.getOrDefault(target, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.print("Enter the elements:");
        int[] arr = new int[n];
        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target element
        System.out.print("Enter the target:");
        int target = scanner.nextInt();

        // Get and print the result
        int result = countOccurrences(arr, target);
        System.out.println(result);

        scanner.close();
    }
}
