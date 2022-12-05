package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07_ReDo {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(10,23,67,23,78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));

        System.out.println(numbers);

        System.out.println("Task 2--------------------");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Brown","Red","White","Black","Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));

        System.out.println(colors);

        System.out.println("Task 3------------------------");

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(23,-34,-56,0,89,100));

        System.out.println(digits);

        Collections.sort(digits);

        System.out.println(digits);

        System.out.println("Task 4-------------");

        ArrayList <String> countries = new ArrayList<>(Arrays.asList("Istanbul","Berlin","Madrid","Paris"));

        Collections.sort(countries);
        System.out.println(countries);

        System.out.println("Task 5------------------");

        ArrayList <String> marvel = new ArrayList<>(Arrays.asList("Spider Man","Iron Man","Black Panther","Deadpool","Captain America"));

        System.out.println(marvel);

        System.out.println(marvel.contains("Wolverine"));

        System.out.println("Task 6-------------");

        ArrayList <String> avengers = new ArrayList<>(Arrays.asList("Hulk","Black Widow","Captain America","Iron Man"));

        Collections.sort(avengers);

        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("Task 7 ------------------------------");

        ArrayList <Character> chars = new ArrayList<>(Arrays.asList('A','x','$','%','9','*','+','F','G'));

        System.out.println(chars);
        System.out.println(chars.size());

        for (Character aChar : chars) {
            System.out.println(aChar);
        }


        System.out.println("Task 8");

        ArrayList <String> obj = new ArrayList<>(Arrays.asList("Desk","Laptop","Mouse","Monitor","Mouse-Pad","Adapter"));

        System.out.println(obj);
        Collections.sort(obj);

        int countObjectsWithMorM = 0;
        int countObjectsNotAoraOrEore = 0;

        for (String s : obj) {
            if(s.contains("M") || s.contains("m")) countObjectsWithMorM++;

            if(!(s.toLowerCase().contains("a") || s.toLowerCase().contains("e"))) countObjectsNotAoraOrEore++;


        }

        System.out.println(countObjectsWithMorM);
        System.out.println(countObjectsNotAoraOrEore);

        System.out.println("Task 9----");

        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate","spoon","fork","Knife","cup","Mixer"));

        System.out.println(kitchenObjects);

        int startswithUpper = 0;
        int startsWithLower = 0;
        int hasPorp = 0;
        int elementsStartsorEndsWithP = 0;

        for (String kitchenObject : kitchenObjects) {

            if(Character.isUpperCase(kitchenObject.charAt(0))) startswithUpper++;

            else startsWithLower++;

            if(kitchenObject.toLowerCase().contains("p")) hasPorp++;

            if(kitchenObject.toLowerCase().startsWith("p") || kitchenObject.toLowerCase().endsWith("p"))
                elementsStartsorEndsWithP++;
        }

        System.out.println(startswithUpper);
        System.out.println(startsWithLower);
        System.out.println(hasPorp);
        System.out.println(elementsStartsorEndsWithP);

        System.out.println("Task 10------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,5,7,10,0,20,17,10,23,56,78));

        System.out.println(nums);

        int dividedBy10 = 0;
        int evenNumsMore15 = 0;
        int oddNumsMore20 = 0;
        int elementsLess15Greater50 = 0;




        }

        }









