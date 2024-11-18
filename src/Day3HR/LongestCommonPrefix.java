package Day3HR;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        Arrays.sort(str);
        String a = str[0], b = str[n - 1];
        for (int i = 0; i < a.length() && i < b.length(); i++)
            if (a.charAt(i) == b.charAt(i))
                System.out.print(a.charAt(i));
            else
                break;
    }
}
