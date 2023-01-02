package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {
        /*
        Preserves insertion order
        Allows duplicates
        they allow null elements

        Performance
        Memory
        Initial capacity
        Load
        The way they store the data is different

         */
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.offer("Orange");

        fruits.offerFirst("Pineapple");
        System.out.println(fruits.element()); // pineapple
        System.out.println(fruits.getFirst());
        System.out.println(fruits); //[Apple, Apple, Orange, , , null, null]


        fruits.clear();

        System.out.println(fruits.poll()); // null poll removes

        System.out.println(fruits.remove()); // nosuchelementexception

    }
}
