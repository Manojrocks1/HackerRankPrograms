package Day11HR;

import java.util.Scanner;

public class AlternatingCharacters {

        public static int alternatingCharacters(String s) {
            int deletions = 0;
            char prevChar = s.charAt(0);

            for (int i = 1; i < s.length(); i++) {
                char currentChar = s.charAt(i);

                if (currentChar == prevChar) {
                    deletions++;
                }

                prevChar = currentChar;
            }

            return deletions;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int queries = scanner.nextInt();

            for (int i = 0; i < queries; i++) {
                String s = scanner.next();
                int result = alternatingCharacters(s);
                System.out.println(result);
            }

            scanner.close();
        }
    }
