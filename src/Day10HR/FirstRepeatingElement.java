//package Day10HR;
//import java.util.HashMap;
//import java.util.Scanner;
//public class FirstRepeatingElement {
//    // Create a HashMap to store the frequency and first occurrence of elements
//    HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
//    int minIndex = Integer.MAX_VALUE;
//
//    // Traverse the array
//        for(int i = 0; i < A.length; i++) {
//        if (elementIndexMap.containsKey(A[i])) {
//            // Update minIndex if a repeat is found
//            minIndex = Math.min(minIndex, elementIndexMap.get(A[i]));
//        } else {
//            // Store the first occurrence index of the element
//            elementIndexMap.put(A[i], i);
//        }
//    }
////
//    // Return the element at minIndex if any repeating element exists
//        return (minIndex == Integer.MAX_VALUE) ? -1 : A[minIndex];
//}
//
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    // Input the size of the array
//    int n = scanner.nextInt();
//    int[] A = new int[n];
//
//    // Input the array elements
//    for (int i = 0; i < n; i++) {
//        A[i] = scanner.nextInt();
//    }
//
//    // Find and print the first repeating element
//    int result = findFirstRepeatingElement(A);
//    System.out.println(result);
//
//    scanner.close();
//}
