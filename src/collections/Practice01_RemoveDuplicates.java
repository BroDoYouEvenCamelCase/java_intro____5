package collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {

    }

    /*
    Create a method that takes an array  of numbers below
    -5,10,-5,10,1,2,5

    Remove all duplicates and return a new array

    [-5,10,1,2,5]

    public static Integer[] removeDuplicates(Integer[] arr){
    ArrayList<Integer> uniques = new ArrayList<>();
    for (Integer i : arr) {
        if(!uniques.contains(i)) uniques.add(i);
    }

    return uniques.toArray(new Integer[0]);

     */



    public static Integer[] removeDuplicates(Integer[] arr){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(arr));
        
        return hs.toArray(new Integer[0]);
    }
}
