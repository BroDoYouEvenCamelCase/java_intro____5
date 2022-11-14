package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        // 1. Declaring an array vs an ArrayList
        String[] names1 = new String [3]; // how you create aan array

        ArrayList<String> names2 = new ArrayList<>(); // capacity is = 10 by default if u dont enter anything

        // 2. Getting the size of the array vs arraylist
        System.out.println("-----------------Size of array vs ArrayList---------------------");

        System.out.println("Size of the array = " + names1.length);  // 3

        System.out.println("Size of the ArrayList = " + names2.size()); // 0

        // 3.  Printing an array vs an ArrayList
        System.out.println("-----------------Printing array vs ArrayList---------------------");

        System.out.println("The array is equal to " + Arrays.toString(names1)); // [null], [null] , [null]

        System.out.println("The ArrayList is equal to " + names2); // []


        // 4. Adding elements to specific indexes
        names1[0] = "Alex";
        names2.add(0,"John"); // names2.add("john);

        System.out.println("--------------printing array vs. ArrayList");
        System.out.println(Arrays.toString(names1));
        System.out.println("ArrayList" + names2);

        //task
        names1[1] = "Ali";
        names1[2] = "Andrrii";

        names2.add(1,"joe");
        names2.add(2,"jane");

        System.out.println("Arrays" + Arrays.toString(names1));
        System.out.println("ArrayList" + names2);

        //Task continued

        names2.add(3,"abdallah");
        names2.add(4,"vlad");
        names2.add(5,"saeed");
        names2.add(6,"suzanne");
        names2.add(7,"Hazal");
        names2.add(8,"Yildiz");
        names2.add(9,"Samir");
        System.out.println("ArrayList" + names2);
        System.out.println("Size of the arraylist = " + names2.size()); // 10;

        //5. Updating an existing element in array vs ArrayList

        names1[1] = "Mike";
        names2.set(1,"Olena");

        System.out.println("The array " + Arrays.toString(names1));
        System.out.println("The ArrayList " + names2);

      /*
        1. size() - gets the size of ArrayList
        return
        returns an Int
        non static because it is called with Object
        no arguments

        2. add(element) - adds an element to the next available cell
        return
        returns a boolean (true when the element is added)
        non- static
        takes an element as argument

        3. add(int index, element)
        Task: it adds element to the specified index)
        void
        does not return anything
        non- static
        takes two arguments as index and the element to be added

        4. set(int index, element)
        TASK: it updates element at the specified index
       return
       returns the replaced - updated element
       non- static
       takes 2 arguments as index and the element

       5. get(index)
       task - retrieves the element at specified index
       return
       returns the element at given index
       non static
       takes index as an argument


       */

        // System.out.println(names2.set(10,"Yoanna"));// outta bounds exception
        // if index is not included in the list, it will be outta bounds

        /*
        CRUD Operations:
        Create - post
        retriever - get
        update - put
        delete
         */


        /*
        6. remove(index)
        Task - it removes the element at specified index
        return
        returns the object that is removed
        non-static
        takes an index as an argument

        7. remove(Object)
        task: it removes given element if exists
        return
        returns a boolean
        non-static
        takes and Object as an argument

        Note: if object specified occurs multiple times in the collection, then remove(Object) method will
        always remove the first occurence

        8. clear()
        - task: it removes all elements from the ArrayList
        void type that means it doesnt return anything
        non- static
        no arguments

        9. removeAll(Collection)
        task: it removes given collection from the array list
        return
        returns a boolean
        non- static
        takes a Collection as an argument

         10. addAll(collection)
        task - it adds all the elements of given collection to the original or the new collection
        returns a boolean
        non static
        takes one argument as a collection

        11. addAll(index, Collection)
        task - adds all elements of given collection to the original collection starting from specified index
        returns a boolean
        non static
        takes two arguments as an index and a Collection

        12. containsAll(Collection)
        task - it checks if all the elements exist in the original collection
        return
        returns a boolean
        non static
        takes a collection as an argument

        13. retainAll(Collection)
        task - it retains (holds) the elements from the given collection in the original collection and removes
        the rest
        return
        returns a boolean
        non-static
        takes a collection as Argument




        */




    }
}
