package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
       /*
Create an ArrayList and store below cities in it
Chicago
Berlin
Miami

Print the size of the ArrayList
Print the ArrayList

EXPECTED:
3
[Chicago, Berlin, Miami]
 */
        System.out.println("Task 1------------------------------");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println(cities);

        System.out.println("Size of the ArrayList = " + cities.size());

        System.out.println("Task 2 -----------------------");
        //update Miami to Evanston
        //Print ArrayList

        cities.set(2,"Evanston");
        System.out.println(cities);

        System.out.println("Task 3 -----------------------");
        //REmove Berlin

        cities.remove("Berlin"); // cities.remove index or "String"
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println(cities.remove(0));
        System.out.println(cities.remove("Evanston"));
        System.out.println(cities); //  [Evanston]
        System.out.println(cities.size()); // 1
        cities.add("Evanston");

        System.out.println("task 4 ------------------------------------------");

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("Task 5-------------------");
        // remove all elements
        // print array list
        //Print the size


        //cities.clear(); // same as removeAll
        cities.removeAll(cities);

        System.out.println(cities);
        System.out.println(cities.size());


    }
}
