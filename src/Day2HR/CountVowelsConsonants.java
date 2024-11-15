package Day2HR;

import java.util.Scanner;

public class CountVowelsConsonants {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string:");
                //Counter variable to store the count of vowels and consonant
                int vCount = 0, cCount = 0;

                //Declare a string
                String str = sc.nextLine();

                //Converting entire string to lower case to reduce the comparisons
                str = str.toLowerCase();

                for(int i = 0; i < str.length(); i++) {
                    //Checks whether a character is a vowel
                    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                        //Increments the vowel counter
                        vCount++;
                    }
                    //Checks whether a character is a consonant
                    else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                        //Increments the consonant counter
                        cCount++;
                    }
                }
                System.out.println("Number of vowels: " + vCount);
                System.out.println("Number of consonants: " + cCount);
            }
        }
