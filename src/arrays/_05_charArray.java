package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1--------\n");
        /*
TASK-1
Create a char array and store values below
#
$
5
A
b
H

Print the array

EXPECTED:
[#, $, 5, A, b, H]
 */


        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        String arrayAsString = Arrays.toString(characters);
        System.out.println(arrayAsString);


        System.out.println("Task2--------------------------------------------");

        System.out.println("The size of the array is = " + characters.length);


       System.out.println("Task 3 --------------");


        for (int i =0; i < characters.length ; i++) {
            System.out.println(characters[i]);
        }
            System.out.println("Task 4------------------------");

       for(char c : characters) {
           System.out.println(c);
       }
        System.out.println("Task 5 ---------------------------------------");

       /*
    TASK-5
    Print each element that are letters

    EXPECTED:
    A
    b
    H
    */ // can also use ASCII table values
        for (char character : characters) {
           if(Character.isLetter(character)) System.out.println(character);
        }

        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter((characters[i]))) System.out.println(characters[i]);

        }

        System.out.println("Task 6-------------------------------");
        /*
TASK-6
Count how many uppercase characters you have in the array

EXPECTED:
2
 */
        int countU1 = 0;

        for (char character : characters) {
            if(Character.isUpperCase(character)) countU1++;

        }

        int countU2 =0;

        for (int i = 0; i < characters.length; i++) {
            if(characters[i] > 65 || characters [i] <= 90) countU2++;

        }

        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i])) countU2++;

        }

        /*
        Additional tasks
        count lowercase,specials,digits, spaces
         */
    }

    }