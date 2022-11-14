package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework06_ReDo {
    public static void main(String[] args) {
        int[] numbers = new int [10];

       numbers[2] = 23;
       numbers[4] = 12;
       numbers[7] = 34;
       numbers[9] = 7;
       numbers[6] =15;
       numbers[0] =89;

        System.out.println(numbers[2]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        String[] str = new String [5];

        str[1] = "abc";
        str[4] = "xyz";

        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("Task 3-------------------------------");

        int[] nums = {23,-34,-56,0,89,100};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Task 4---------------------");

        String[] countries = {"Germany","Argentina","Ukraine","Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("Task 5-------------------------");

        String[] dogs = {"Scooby Doo", "Snoopy","Blue","Pluto","Dino","sparky"};
        System.out.println(Arrays.toString(dogs));

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };

        boolean containsPluto = false;

        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                containsPluto = true;
                break;
            }
        }
        System.out.println(Arrays.toString(cartoonDogs));
        System.out.println(containsPluto);

        System.out.println("Task 8--------------------------");
            char[] chars = {'A','b','G','H',7,5,'&','*','e','@','4'};

        System.out.println(Arrays.toString(chars));
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specials = 0;

        for (char aChar : chars) {
            if(Character.isUpperCase(aChar)) upperCase++;
            else if(Character.isLowerCase(aChar)) lowerCase++;
            else if(Character.isDigit(aChar)) digits++;
            else if (aChar != ' ') specials++; }

            System.out.println("Letters = " + (upperCase + lowerCase));
            System.out.println("Uppercase = " + upperCase);
            System.out.println("Lowercase = " + lowerCase);
            System.out.println("Digits = " + digits);
            System.out.println("Specials = " + specials);

        System.out.println("Task 9 --------------------------------");

        String[] objects = {"Pen","notebook","Book","paper","bag","pencil","Ruler"};
        System.out.println(Arrays.toString(objects));

        int startsWithUpper = 0;
        int startsWithLower= 0;
        int startswithBOrP = 0;
        int hasBookOrPen = 0;

        for (String object : objects) {
            if(Character.isUpperCase(object.charAt(0))) startsWithUpper++;
            else startsWithLower++;

            if(object.toLowerCase().charAt(0) == 'b' || object.toLowerCase().charAt(0) == 'p') startswithBOrP++;

            if(object.toLowerCase().contains("book")|| object.toLowerCase().contains("pen")) hasBookOrPen ++;

        }


        System.out.println("Elements that starts with uppercase = " + startsWithUpper);
        System.out.println("Elements that starts with uppercase = " + startsWithLower);
        System.out.println("Elements that starts with uppercase = " + startswithBOrP);
        System.out.println("Elements that starts with uppercase = " + hasBookOrPen);

        System.out.println("Task 10------------------");

        int[] numero = {3,5,7,10,0,20,17,10,23,56,78};
         int lessThan10 = 0;
         int moreThan10 = 0;
         int are10 = 0;
        System.out.println(Arrays.toString(numero));
        for (int i : numero) {
            if( i < 10)  lessThan10++;
            else if ( i > 10) moreThan10 ++;
            else if( i ==10) are10++;

        }

        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 " + lessThan10);
        System.out.println("Elements that are 10 = " + are10);



        String name = "john";

        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(i);
        }

        }
        }







