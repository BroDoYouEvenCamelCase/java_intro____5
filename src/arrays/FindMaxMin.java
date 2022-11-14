package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.EnumSet;

import static arrays._09_Find_Max_Min.printMaxAndMinWithSort;

public class FindMaxMin {
    public static void main(String[] args) {
         /*
    create public static method which will take an int array then it will find the
    max and min numbers from there and print it.
    Examples:
        Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};
    Output:
        Max = 7
        Min = -5
    NOTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
    method names:
        *printMaxAndMinWithSort
        *printMaxAndMinWithoutSort
     */
        int[] numbers = {5, 3, 2, 4, 7, -5};


        printMaxAndMinWithSort(numbers);
    }

    /*
    create public static method which will take an int array then it will find the
    max and min numbers from there and print it.
    Examples:
        Array ->   int[] numbers = {5, 3, 2, 4, 7, -5};
    Output:
        Max = 7
        Min = -5
    NOTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
    method names:
        *printMaxAndMinWithSort
        *printMaxAndMinWithoutSort
     */

    public static void printMaxAndMinWithSort(int[] numbers){
        /*
        - Sort
        - print first and last
         */

        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Max = " + numbers[numbers.length - 1]);
            System.out.println("Min = " + numbers[0]);
        }else{
            System.out.println("Array is empty!");
        }
    }}





