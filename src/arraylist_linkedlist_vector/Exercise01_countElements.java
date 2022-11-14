package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        /*
        Create an ArrayList and store below elements:
        Blue,Brown, Pink, Yellow, Red, Purple
         print the list
         print the size
         print each separately
         */

        System.out.println("Task 1----------------------");

        String [] elements = {"Blue", "Brown", "Pink","Yellow","Red","Purple"};
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink","Yellow","Red","Purple"));
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);

        System.out.println("Size of the ArrayList = " + colors.size());

        for (String color : colors) {
            System.out.println(color);

            /*
            count the elements that have length of 6
            expected = 2
             */

            System.out.println("Task 2 ------------------------------------");

           int count6=0;
            for (String s : colors) {
                if(color.length() == 6) count6++; //2

            }
            System.out.println(count6);

            count6 = 0;
            for (int i = 0; i < colors.size() ; i++) {
                if(colors.get(i).length() == 6) count6++;
            }
            System.out.println(count6); // 2


        }

        /*
        count elements that have 'o'
        expected: 2
         */

        int countO = 0;
        for (String color : colors) {
            if(color.toLowerCase().contains("o")) countO++;

        }
        System.out.println(countO);

        countO = 0;

        for (int i = 0; i <colors.size() ; i++) {
            if(colors.get(i).toLowerCase().contains("o")) countO++;


        }
        System.out.println(countO);


    }


    }

