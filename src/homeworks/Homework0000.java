package homeworks;

import java.util.Scanner;

public class Homework0000 {
    public static void main(String[] args) {

            System.out.println("\n==========TASK08==========\n");

            char[] charArr = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4', ' '};
            int uLetters = 0;
            int lLetters = 0;
            int digits = 0;
            int special = 0;

            for (char c : charArr) {
                    if(Character.isUpperCase(c)) uLetters++;
                    else if(Character.isLowerCase(c)) lLetters++;
                    else if(Character.isDigit(c)) digits++;
                    else if(c != ' ') special++;
            }

            System.out.println("Letter = " + (uLetters + lLetters));
            System.out.println("Uppercase letters = " + uLetters);
            System.out.println("lowercase letters = " + lLetters);
            System.out.println("digits = " + digits);
            System.out.println("Special characters = " + special);
    }


}



