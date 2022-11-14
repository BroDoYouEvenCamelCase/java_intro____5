package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _05_containsAll_renameAll_Method {
    public static void main(String[] args) {
        ArrayList<String>countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");
       /*
    Check if the countries ArrayList contains Spain
    Print true if it contains, and false otherwise

    EXPECTED:
    true
    */

        System.out.println(countries.contains("Spain"));

        boolean hasSpain = false;

        for (String country : countries) {
            if(country.equals("Spain")) {
                hasSpain = true;
                break;
            }

        }
        System.out.println(hasSpain);

        /*
        check if arraylist contains sweden and denmark
        false
         */
        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));

        boolean hasSweden = false, hasDenmark = false;
        for (String country : countries) {
            if(country.equals("Sweden")) hasSweden=true;
            else if(country.equals("Denmark")) hasDenmark = true;

            if(hasDenmark && hasSweden) break;
        }
        System.out.println(hasDenmark && hasSweden);

        /*
        check if the countries arrayist contains Sweden, spain, germany, portugal
        true
         */

        ArrayList<String> europeCountries= new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");

        System.out.println(countries.containsAll(europeCountries));  // true


    }
}
