package practice.arraysPractice;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // [ [ 1,1], [2,4] , [3,9]] -- outer size = 3, inner size = 3

        int [][] numbersSquare = new int [3][2];
        int [] [] numbersSquare2 = {{1,1}, {2,4}, {3,9}};

        System.out.println(Arrays.deepToString(numbersSquare));
        System.out.println(Arrays.deepToString(numbersSquare2));

        System.out.println(numbersSquare2[0][0]);// (1) // to get first element of array the first [1]
        System.out.println(numbersSquare2[1][1]); // (4) // to get first element of second array the [2]
        System.out.println(numbersSquare2[2][0]); //(3) // to get the first element of the third array [3]








    }
}
