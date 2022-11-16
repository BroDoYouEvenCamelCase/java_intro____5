package homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("Task 1---------------------");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        System.out.println(countConsonants(str1));

        System.out.println("Task 2----------------------");

        String str2 = scan.nextLine();
        System.out.println(Arrays.toString(wordArray(str2)));

        System.out.println("Task 3-----------------------");

        String str3 = scan.nextLine();
        System.out.println(removeExtraSpaces(str3));

        System.out.println("Task 4---------------------------");

        System.out.println(count3OrLess());

        System.out.println("Task 5-------------------------");

        System.out.println("Please provide date of birth");
        String str5 = scan.nextLine();
        System.out.println(isDateFormatValid(str5));

        System.out.println("Task 6-----------------------------");

        String str6 = scan.nextLine();
        System.out.println();
        System.out.println(isEmailFormatValid(str6));


    }
    public static int countConsonants(String str1) {
        Pattern pattern = Pattern.compile("(?i)[^aeiou\\s\\d\\W]");
        Matcher matcher = pattern.matcher(str1);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static String[] wordArray(String str2) {
        str2 = str2.replaceAll("\\s+,", " ").trim();
        String[] wordArray = str2.split(" ");
        return wordArray;
    }

    public static String removeExtraSpaces(String str3){
        return str3.replaceAll("\\s+", " ");
    }

    public static int count3OrLess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int count = 0;
        for (String s : arr) {
            if (s.length() <= 3) count++;
        }
        return count;
    }

    public static boolean isDateFormatValid(String str5) {

        return str5.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}");



    }

    public static boolean isEmailFormatValid(String str6) {

        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}", str6));


    }

}
