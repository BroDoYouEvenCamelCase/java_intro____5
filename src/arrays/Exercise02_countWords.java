package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02_countWords {
    public static void main(String[] args) {
        /*
        assume you are given below string
        String sentence = "I love arrays";
        Count how many words you have in this String
        expected: 3
         */

        String sentence = "I love arrays";
        int countS = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') countS++;
        }
        System.out.println(countS+1);


        int countF = 0;
        for(char c : sentence.toCharArray()){
            if(c == ' ') countF++;
        }
        System.out.println(countF + 1);

        System.out.println("solution 2 with split() method------------------------------------");

        System.out.println(sentence.split(" ").length); // 3
    }
}
