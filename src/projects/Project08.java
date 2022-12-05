package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("Task 1 --------------------");
        int[] numbers = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(numbers));

        System.out.println("Task 2---------------------");
        int[] numb = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(numb));

        System.out.println("Task 3----------------------");
        String str = "abc abc d";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println("Task 4----------------------");
        int[] element = {4,7,8,6};
        System.out.println(findMissingNumber(element));

    }

    public static int findClosestDistance(int[] numbers) {
        int closestDistance = Integer.MAX_VALUE;
        if (numbers.length <= 1)
            return closestDistance = -1;
        else
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (Math.abs(numbers[i] - numbers[j]) < closestDistance) ;
                    closestDistance = Math.abs(numbers[i] - numbers[j]);
                }

            }
        return closestDistance;
    }


    public static int findSingleNumber(int[] numbers) {
        int singleValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j])
                    singleValue = numbers[i];
            }
        }
        return singleValue;
    }

    public static char findFirstUniqueCharacter(String str) {
        char singleChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                singleChar = str.charAt(i);
            break;
        }
        return singleChar;
    }

    public static int findMissingNumber(int[] element){
        Arrays.sort(element);

        int container = 0;

        for (int i = 0; i <element.length-1; i++) {
            if(Math.abs(element[i] - element[i+1]) !=1) {
                container =element[i]+1;
            }

        }
            return container;
    }





    }



