package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("Task 1-------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,23,67,23,78));


        numbers.get(3);
        numbers.get(0);
        numbers.get(2);
        System.out.println(numbers);

        System.out.println("Task 2--------------------");

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Blue","Brown","Red","White","Black","Purple"));

        list.get(1);
        list.get(3);
        list.get(5);
        System.out.println(list);

        System.out.println("Task 3---------------------------");

        ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(23,-34,-56,0,89,100));
        System.out.println(numbs);
        Collections.sort(numbs);
        System.out.println(numbs);

        System.out.println("Task 4--------------------------------");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul","Berlin","Madrid","Paris"));
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("Task 5--------------------------------------");

        ArrayList<String> marvelChars = new ArrayList<>(Arrays.asList("Spider Man","Iron Man","Black Panther","Deadpool","Captain America"));

        System.out.println(marvelChars);
        Object[] arr = marvelChars.toArray();
        System.out.println(Arrays.toString(arr));

        if(Arrays.toString(arr).contains("Wolverine")){
            System.out.println("TRUUUUUUUUUUUUUUUU");
        }else System.out.println("FALSE");

        System.out.println("Task 6------------------------------");
        ArrayList<String> avengers = new ArrayList <>(Arrays.asList("Hulk","Black Widow","Captain America","Iron Man"));
        Collections.sort(avengers);
        Object[] array = avengers.toArray();
        System.out.println(avengers);


        if(Arrays.toString(array).contains("Hulk") && Arrays.toString(array).contains("Iron Man")) {
            System.out.println("TRUUUUUUUUUU");
        }else System.out.println("FALSE");

        System.out.println("Task 7---------------------------------");

        ArrayList <Character> characters = new ArrayList<>(Arrays.asList('A','x','$','%','9','*','+','F','G'));

        for (int i = 0; i < characters.size();i++) {
            System.out.println(characters.get(i));
        }

        System.out.println("Task 8------------------------------------");
        ArrayList<String> computerItems = new ArrayList<>(Arrays.asList("Desk,","Laptop","Mouse","Monitor","Mouse-Pad","Adapter"));
        System.out.println(computerItems);
        Collections.sort(computerItems);
        System.out.println(computerItems);
        int count =0;
        for (int i = 0; i <computerItems.size() ; i++) {
            if(computerItems.get(i).toLowerCase().startsWith("m")) count++;
        }
        System.out.println(count);

        computerItems.removeIf(x -> x.contains("A"));
        computerItems.removeIf(x -> x.contains("a"));
        computerItems.removeIf(x -> x.contains("E"));
        computerItems.removeIf(x -> x.contains("e"));

        System.out.println(computerItems.size());

        ArrayList<String> kitchenObj = new ArrayList<>(Arrays.asList("Plate","spoon","fork","Knife","cup","Mixer"));


        System.out.println(Arrays.toString(kitchenObj.toArray()));


        int startWtihUppercase = 0;
        int startWithLowercase = 0;
        int containP = 0;
        int startOrEndWithP = 0;

        for(String obj : kitchenObj) {
            if(Character.isUpperCase(obj.charAt(0))) startWtihUppercase++;
            if(Character.isLowerCase(obj.charAt(0))) startWithLowercase++;
            if(obj.toLowerCase().contains("p")) containP++;
            if(obj.toLowerCase().endsWith("p") || obj.toLowerCase().startsWith("p")) startOrEndWithP++;
        }

        System.out.println("Elements starts with uppercase = " + startWtihUppercase);
        System.out.println("Elements starts with lowercase = " + startWithLowercase);
        System.out.println("Elements having P or p = " + containP);
        System.out.println("Elements starting or ending with P or p = " + startOrEndWithP);

        System.out.println("task 10----------------------------");

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(3,5,7,19,0,20,17,10,23,56,78));

        System.out.println(digits);

        System.out.println("Elements that can be divided by 10 = " +digits.stream().filter(x -> x /10 == 0).count());

        System.out.println("Elements that are even and greater than 15 = " + digits.stream().filter(x -> x % 2 == 0 && x > 15 ).count());

        System.out.println("Elements that are odd and less than 20 = " + digits.stream().filter(x -> x % 2 == 1 && x < 20   ).count());

        System.out.println("Elements that area less than 15 or greater than 50 = " + digits.stream().filter(x -> x < 15 || x > 50).count());














    }







        }









