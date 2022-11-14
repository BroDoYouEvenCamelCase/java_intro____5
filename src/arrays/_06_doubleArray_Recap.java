package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // create a double array with using curly brackets
        // 1.5, 2.3, -1.3, -3.7,
        double [] doubles = {1.5, 2.3, -1.3, -3.7};
        char [] chars = {'a', 'b', 'c','d'};
        System.out.println(Arrays.toString(doubles));

        // print the length

        System.out.println("The length of the array is " + doubles.length); // length is 4

        // change values form  1.5, 2.3, -1.3, -3.7 -------> -3.7, -1.3, 1.5, 2.3

        Arrays.sort(doubles);
        System.out.println("Array after sorting " + Arrays.toString(doubles));

        // print out value in separate line
        /*
        output:
        -3.7
        -1.3
        1.5
        2.3
         */

        //using For I loop // array to String method only when you want to print the whole arrray
        //When u need indexes or an increment ot use go with for i loop with arrays
        System.out.println(" \n For I loop print below ");
        for (int i = 0; i <doubles.length ; i++) {
            System.out.println(doubles[i]); // if u dont need an index dont use this
        }

        // if u dont need an index or increment number to use go with (for each loop with arrays)
        System.out.println(" \n For each loop print below ");

        for (double d: doubles){
            System.out.println(d);
        }

        /*
        output:
        -3.7 -a - at index 0
        -1.3 -b  - at index 1
        1.5 -c  - at index 2
        2.3 - d - at index 3
         */

        System.out.println("\n For i loop print two arrays below");
        for (int i = 0; i <doubles.length; i++) {
            System.out.println(doubles[i] + " - " + chars[i]);
            // will print the doubles array first then adds the chars array

        }
        System.out.println("Unecessary example with for each loop ");
        int i =0;
        for (double d: doubles){
            System.out.println(d);
            i++;
        }








    }
}
