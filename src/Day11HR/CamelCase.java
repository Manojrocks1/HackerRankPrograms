package Day11HR;

import java.util.Scanner;

public class CamelCase {
    public static String toCamelCase(String s) {
        // Split the input into words based on spaces
        String scanner = "";
        String[] words = scanner.trim().toLowerCase().split("\\s+");
        StringBuilder camelCaseString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                // First word is all lowercase
                camelCaseString.append(words[i]);
            } else {
                // Capitalize the first letter of subsequent words
                camelCaseString.append(Character.toUpperCase(words[i].charAt(0)))
                        .append(words[i].substring(1));
            }
        }
        return camelCaseString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to convert to CamelCase:");
        String sentence = scanner.nextLine();

        String camelCase = String.valueOf(toCamelCase(sentence));
        System.out.println("CamelCase version: " + camelCase);

        scanner.close();
    }
}