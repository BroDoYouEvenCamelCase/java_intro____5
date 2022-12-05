package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework06_ReDo {
    public static void main(String[] args) {


        int[] array = new int[10];

        array [2] = 23;
        array [4] = 12;
        array [7]= 34;
        array [9] = 7;
        array [6] = 15;
        array [0] = 89;

        System.out.println(array[3]);
        System.out.println(array[0]);
        System.out.println(array[9]);

        System.out.println(Arrays.toString(array));

        System.out.println("Task 2---------------------");

        String [] str = new String[5];

        str [1] = "abc";
        str [4] = "xyz";

        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);

        System.out.println(Arrays.toString(str));

        System.out.println("Task 3--------------------------------");

        int [] nums = {23,-34,-56,89,100};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);

        System.out.println("Task 4------------------------");

        String [] countries = {"Germany", "Argentina", "Ukraine","Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println("Task 5-------------------------");

        String [] cartoonDogs = { "Scooby Doo","Snoopy","Blue","Pluto","Dino","Sparky"};

        boolean containsPluto = false;

        for (String cartoonDog : cartoonDogs) {
            if(cartoonDog.equals("Pluto")) {
                containsPluto = true;
                break;
            }
        }

        System.out.println(Arrays.toString(cartoonDogs));
        System.out.println(containsPluto);

        System.out.println("Task 6-------------");

        String [] cartoonCats = {"Garfield","Tom","Azrael","Sylvester"};
        Arrays.sort(cartoonCats);

        System.out.println(Arrays.toString(cartoonCats));


        System.out.println(Arrays.binarySearch(cartoonCats,"Garfield") >= 0
                && Arrays.binarySearch(cartoonCats,"Felix") >=0);

        boolean containsGarfield = false;
        boolean containsFelix = false;
        boolean containsBoth = false;
        for (String cartoonCat : cartoonCats) {
            if(cartoonCat.contains("Garfield")) containsGarfield = true;
            else if(cartoonCat.contains("Felix")) containsFelix = true;

            if(containsGarfield && containsFelix) {
                containsBoth = true;
                break;
            }

        }

        System.out.println(containsBoth);

        System.out.println("Task 7-----------------");

        double [] array1 = {10.5, 20.75, 70.00, 80.00,15.75};

        System.out.println(Arrays.toString(array1));

        for (int i = 0; i <array1.length ; i++) {

            for (double v : array1) {
                if(v % (int)v == 0) System.out.println((int)v);
                else System.out.println(v);
            }
        }

        System.out.println("Task 8 ------------------------");

        char [] chars = {'A','b','G','H','7','5','&','*','e','@','4'};

        System.out.println(Arrays.toString(chars));

        int letters = 0;
        int upperLetters = 0;
        int lowerLetters = 0;
        int digits = 0;
        int specialsChars = 0;

        for (char aChar : chars) {
            if(Character.isLetter(aChar)) letters++;
            else if(Character.isUpperCase(aChar)) upperLetters++;
            else if(Character.isLowerCase(aChar)) lowerLetters++;
            else if(Character.isDigit(aChar)) digits++;
            else if (aChar != ' ') specialsChars++;

        }

        System.out.println(letters);
        System.out.println(upperLetters);
        System.out.println(lowerLetters);
        System.out.println(digits);
        System.out.println(specialsChars);


        String [] objects = {"Pen","notebook","Book","paper","bag","pencil","Ruler"};

        int uppercase = 0;
        int lowercase = 0;
        int hasBOrP = 0;
        int hasBookOrPen = 0;
        for (String object : objects) {
            if(Character.isUpperCase(object.charAt(0))) uppercase++;
            else lowercase++;

            if(object.toLowerCase().charAt(0) == 'b' || object.toLowerCase().charAt(0) == 'p') hasBOrP++;

            if(object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) hasBookOrPen++;

        }

        System.out.println("Elements that start with upper case = " + uppercase);
        System.out.println("Elements that start with lower case = " + lowercase);
        System.out.println("Elements that start with B or P  = " + hasBOrP);
        System.out.println("Elements that start book or pen = " + hasBookOrPen);

        System.out.println("Task 10 --------------");

        int [] numbs = {3,5,7,10,0,20,17,10,23,56,78};

        System.out.println(Arrays.toString(numbs));

        int moreThan10 = 0;
        int lessThan10 = 0;
        int exactly10 = 0;

        for (int numb : numbs) {
            if(numb > 10) moreThan10++;
            else if (numb < 10) lessThan10++;
            else if(numb == 10) exactly10++;


        }

        System.out.println(moreThan10);
        System.out.println(lessThan10);
        System.out.println(exactly10);

        System.out.println("Task 11-----------------------------");

        int [] first = {5,8,13,1,2};
        int [] second = {9,3,67,1,0};

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int [] third = new int[5];

        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i],second[i]);

        }

        }
    }













