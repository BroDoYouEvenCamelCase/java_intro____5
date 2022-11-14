package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        // create a string array with length of 4 // not with curly braces

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));
        // assign "Apple" to index of 0
        // Assign "Kiwi to index of 3
        //Then print the array again

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits));

        //Assign "Grapes" to index of 1
        // Assign "Orange" to index of 2

        fruits[1] = "Grapes";
        fruits[3] = "Kiwi";

        System.out.println("\n Reasigning values");
        // Reassign "Apple" to index of 3 and to index of 2
        // [Apple.Grapes, Orange, Kiwi] - Apple, Grapes, Apple, Apple

        fruits[3] = fruits[0];// reassigned
        fruits[2] = fruits[0]; // reassigned

        System.out.println(Arrays.toString(fruits));


        fruits[0] = "Apple";
        fruits[1] = "Grapes";
        fruits[2] = "Apple";
        fruits[3]= "Apple";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\n Printing values with for each loop ");
        /*
        For(DataType name: arrayName){
        code to be executed
         */
        for (String singleFruit : fruits) {
            System.out.println(singleFruit);

        }

    }
}
