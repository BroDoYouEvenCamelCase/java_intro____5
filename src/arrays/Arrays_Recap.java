package arrays;

import java.sql.SQLOutput;

public class Arrays_Recap {

    public static void main(String[] args) {

        // First way to create an array :

        // int [] numbers = new int [length];(length is a must)
        // int [] numbers = {1,2,3,4};

        //Ways to create a multidimensional array:

        // [ [ 1,1] , [2,4] , [3,9]]

        //1.
        int [] [] numbersSquare = new int [3] [2];

        //Ways to reassign:
        //change the "4" with "1"
        int [] numbers = {1,2,3,4};
        numbers [3] = numbers [0];// changing the value of "4" with "1"

        // change 2 with 3
        // Ex: numbers [1] = numbers [2];
        // other way Ex: numbers[1] =3;

        //Default values for data types:
                    //Primitives
        // int =0;
        //double = 0.0
        // char = 'Q' thingy looking thing (nothing sign)
        // boolean = false
        //Objects- String = null







    }
}
