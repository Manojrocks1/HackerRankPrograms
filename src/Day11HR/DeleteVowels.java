package Day11HR;

import java.util.Scanner;

public class DeleteVowels {
        // Driver Code
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string:");
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<str.length();i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                    sb.append(str.charAt(i));
            }
            System.out.println("After removing the vowels is "+sb.toString());
        }
    }
