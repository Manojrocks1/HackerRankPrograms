package Day20HR;
import java.util.Scanner;

public class ReverseOfSentence {
    public static void main(String[] args) {


        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read a line of input from the user
        String s = sc.nextLine();

        // Split the input string into an array of substrings (words) using space as the delimiter
        String[] str = s.split(" ");

        // Loop through the array in reverse order, starting from the last element
        for (int i = str.length - 1; i >= 0; i--) {
            // Check if the current substring is not empty
            if (!str[i].isEmpty()) {
                // Print the non-empty substring followed by a space
                System.out.print(str[i] + " ");
            }
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
