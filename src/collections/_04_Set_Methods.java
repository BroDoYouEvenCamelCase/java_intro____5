package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set); // [Bar, bar, abc, Foo, foo, xxx] insertion order is random because it is a hashset

        System.out.println(set.size()); // you can get the size for any of the collections

        System.out.println(set.isEmpty());

        System.out.println(set.contains("ABC")); // false
        System.out.println(set.contains("abc")); // true

        System.out.println(set.remove("AAA")); // false

        System.out.println(set.remove("xxx"));  // true
        System.out.println(set);

        System.out.println(set.equals(set));  // true

        set.removeIf(e ->e.toLowerCase().startsWith("b"));

        System.out.println(set );


        for (String s : set) {
            System.out.println(s);

        }

        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());

        set.removeAll(set);  // removing all


    }
}
