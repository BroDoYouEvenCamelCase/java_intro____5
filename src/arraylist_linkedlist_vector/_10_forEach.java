package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _10_forEach {
    public static void main(String[] args) {
        /*
        create an array list to store below elements
        blue
        red
        brown
        pink
        yellow
        black
        print the Array list

         */
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);

        System.out.println("for iteratinon with for i way ---------------------------");

        for (int i = 0; i < colors.size();i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("iterating with for each loop------------");

        for (String color : colors) {
            System.out.println(colors);

            System.out.println("Iterating with for each ----------------------");
            colors.forEach(System.out::println);
        }
    }
}
