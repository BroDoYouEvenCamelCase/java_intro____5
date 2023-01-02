package collections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Practice03_SubSets {
    public static void main(String[] args) {
        /*
        Create a collection to store below numbers

        3,2,7,10,15,20,7,5

        Find all the elements more than 7 -> [10,15,20]
        Find all the elements less than or equal to 5 - [2,3,5]
        Find all the elements between 5 and 15 both inclusive -> [5,7,10,15]
         */

        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(3,2,7,10,15,20,7,5));

        SortedSet<Integer> moreThan7 = numbers.tailSet(8);

        SortedSet<Integer> lessThanOrEqualTo5 = numbers.headSet(6);

        SortedSet<Integer> between5And15 = numbers.subSet(5, 16);

        System.out.println(moreThan7);
        System.out.println(lessThanOrEqualTo5);
        System.out.println(between5And15);



    }
}
