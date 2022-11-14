package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /*
        Create an array list to store below numbers
        10
        15
        20
        10
        20
        30
       Print the ArrayList
       Print size
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("Contains methods --------------------------------");

        // based on top array list
        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(12)); // false
        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(22)); // false

        System.out.println("IndexOf() methods --------------------------------");

        numbers.indexOf(15); // 1
        numbers.indexOf(25); // -1
        numbers.indexOf(20); // 2

        System.out.println("last IndexOf() methods --------------------------------");

        System.out.println(numbers.lastIndexOf(10));
        System.out.println(numbers.lastIndexOf(30));
        System.out.println(numbers.lastIndexOf(35));

        System.out.println("retrieving each element with for i loop --------------------------------");
        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(4);
        numbers.get(5);
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }

        System.out.println("For each loop ---------------------");
        for(Integer number : numbers){
            System.out.println(number);

            System.out.println();




        }

        }


    }

