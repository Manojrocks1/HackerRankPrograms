package Day8HR;

import java.util.Scanner;

public class AverageList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Read the size of the array from the user
        int n = sc.nextInt();
        int[] numbers = new int[n]; // Initialize an array to hold 'n' integers

        // Read 'n' integers into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        double sum = 0; // Variable to hold the sum of all elements in the array

        // Iterate through the array and calculate the sum of its elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each element to the sum
        }

        // Calculate the average by dividing the sum by the number of elements
        double average = sum / numbers.length;

        // Print the calculated average
        System.out.println(average);
    }
}