package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWIthIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));
        /*
        Remove elements that contains "book"
        this is case insensitive
        print the list -> [Pen,Pencil]
         */

        Iterator<String> iterator = objects.iterator();
        while(iterator.hasNext())                      {
            if(iterator.next().toLowerCase().contains("book"))  iterator.remove();
        }
        System.out.println(objects);


    }
}
