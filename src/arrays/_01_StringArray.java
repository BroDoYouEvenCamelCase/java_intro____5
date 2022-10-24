package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {
        //1. declare string array called as countries and assign size of 3
        String[] countries = new String [3];

        // 2. assigning value to specific indexes
        countries [1] = "Spain";

        // 3. Print specific index from an array
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // Spain

        //4. printing an array
        System.out.println(Arrays.toString(countries));

        /*
        Assign Belgium to index of 2 and print array once again
        [null, Spain,Belgium)
       */
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries));

        // 5. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries)); // [null,France,Belgium]

        //6. Getting the length of an array - how many elements -3
        // can do this way int i = countries.length; or
        System.out.println(countries.length); // 3

        //7. Printing each element separately
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // France
        System.out.println(countries[2]); // Belgium

        for (int i = 0; i < 2; i++) {
            System.out.println("Country at index of" + i + "is " +countries [i]);

        }

        }


    }