package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector <>(Arrays.asList(10,15,20,25,30));
        /*
        count evens - 3
        count odds - 2
        count numbers that are more than 15
        count numbers that are more than or less than 15
         */

        //numbers.removeIf(x -> x % 2 ==1);           not
        //System.out.println(numbers.size());  //3    like
        //System.out.println(numbers);                  this

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count()); // 3    }
        System.out.println(numbers.stream().filter(x -> x % 2 == 1).count()); // 2    }
        System.out.println(numbers.stream().filter(x -> x == 15).count()); // 3    }
        System.out.println(numbers.stream().filter(x -> x != 20).count()); // 4


    }}
