package Day11HR;
import java.util.Scanner;
public class CountOccurences {
    public static void main(String[] args) {
                /* Read input string and substring from user */
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                String sub = scanner.nextLine();

                /* Call function to count occurrences */
                int count = countOccurrences(str, sub);
            }

            public static int countOccurrences(String str, String sub) {
                int count = 0;
                int len = sub.length();

                /* Iterate through the string, checking for the substring at each position */
                for (int i = 0; i <= str.length() - len; i++) {
                    if (str.substring(i, i + len).equals(sub)) {
                        count++;
                    }
                }

                return count;
            }
        }
