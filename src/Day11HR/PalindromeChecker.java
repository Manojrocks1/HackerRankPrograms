package Day11HR;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Create a StringBuffer to build a new string without non-alphanumeric characters
        StringBuffer sb = new StringBuffer();

        // Iterate through each character in the original string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is a letter or digit using Character.isLetterOrDigit()
            if (Character.isLetterOrDigit(currentChar)) {
                // If it's a letter or digit, append it to the StringBuffer
                sb.append(currentChar);
            }
        }

        // Convert both the original string and the filtered string to lowercase for case-insensitive comparison
        String lowercaseString = s.toLowerCase();
        String filteredLowercaseString = sb.toString().toLowerCase();

        // Check if the lowercase versions of the original and filtered strings are equal when reversed
        if (lowercaseString.equalsIgnoreCase(new StringBuffer(filteredLowercaseString).reverse().toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}