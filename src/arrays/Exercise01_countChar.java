package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        //Assume you are given a string as below
        //String word = "Java";
        //Count how many A you have in string
        // expected output: 2

        String word = "Java";

        int countA = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a') countA++;
        }

        System.out.println(countA);



        char [] wordArray = word.toCharArray(); // { 'J', 'a', 'v', 'a'}
        System.out.println(wordArray); // [J,a,v,a]
        int countB = 0;

        for (char element: wordArray) {
            if(element == 'a') countB++;

        }

        System.out.println(countB);



      }

    }

