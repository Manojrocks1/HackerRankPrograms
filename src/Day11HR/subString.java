package Day11HR;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to insert: ");
    String sub = scanner.nextLine();

        System.out.print("Enter the position to insert the substring: ");
    int position = scanner.nextInt();

    // Check if the position is valid
        if (position < 0 || position > str.length()) {
        System.out.println("Invalid position");
        return;
    }

    // Insert the substring
    String modifiedString = str.substring(0, position) + sub + str.substring(position);

        System.out.println("Modified string: " + modifiedString);
}
}
