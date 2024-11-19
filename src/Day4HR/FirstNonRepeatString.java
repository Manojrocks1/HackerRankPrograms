package Day4HR;

import java.util.Scanner;

public class FirstNonRepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        int i,j,count=0,ch=0;

        for(i=0;i<s.length();i++){
            count = 0;
            for(j=0;j<s.length();j++)
                if(i!=j && s.charAt(i) == s.charAt(j))
                {
                    count = 1;
                    break;
                }
            if(count ==0)
            {
                ch = 1;
                System.out.println(s.charAt(i));
                break;
            }
        }
        if(ch == 0)
            System.out.println("No non-repeating character found");


    }
}
