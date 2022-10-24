package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1 ----------------------------");

        System.out.println("Please enter a String");
        String str = scanner.nextLine();
        if (str.length() < 8) {
            System.out.println("This String does not have 8 characters");
        } else {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) + str.substring(0, 4));
        }

        System.out.println("Task 2-----------------------------");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = inputReader.nextLine();

        if (sentence.length() <= 1) {
            System.out.println("This sentence does not have 2 or more words to swap ");
        } else {
            System.out.println(sentence.substring(sentence.length() - 4) + sentence.substring(8, sentence.length() - 4) + sentence.substring(0, 8));
        }



        System.out.println("Task 3 -------------------------------------");


        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot\n" +
                "look shoes";

        String badWord1 = "stupid";
        String badWord2 = "idiot";
        String goodWord = "nice";

        System.out.println(str1.replace(badWord1, goodWord));
        System.out.println(str2.replace(badWord2, goodWord));
        System.out.println(str3.replace(badWord1, goodWord).replace(badWord2, goodWord));


        System.out.println("Task 4-------------------------");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            else System.out.println(name.charAt(name.length() / 2));
        } else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("Task 5 -----------------------------------------");

        System.out.println("Please enter a country");
        String country = scanner.nextLine();
        if (country.length() >= 5) System.out.println(country.substring(2, country.length() - 2));
        else System.out.println("Invalid input!!!");

        System.out.println("Task 6---------------------------------------------");
        String address = ScannerHelper.getAnAddress();

        System.out.println(address.replace("a", "*")
                .replace("A", "*").replace("e", "#")
                .replace("E", "*").replace("i", "+")
                .replace("I", "+").replace("u", "$")
                .replace("U", "$").replace("o", "@")
                .replace("O", "@"));

        System.out.println("Task 7 -----------------------------");

        int randomNum1 = (int) (Math.random() * 26);
        int randomNum2 = (int) (Math.random() * 26);
        String result = "";
        for (int i = Math.min(randomNum1, randomNum2); i <= Math.max(randomNum1, randomNum2); i++) {
            if (i % 5 != 0) result += i + " - ";
        }
        System.out.println(result.substring(0, result.length() - 3));

        System.out.println("Task 8 ------------------");

        System.out.println("Please enter sentence");
        Scanner inputReader1 = new Scanner(System.in);
        String strTask8 = inputReader1.nextLine();

        int count = 1;

        for (int i = 0; i < strTask8.length() - 1; i++) {
            if ((strTask8.charAt(i) == ' ') && (strTask8.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);

        if ( count <= 1 ) {
            System.out.println("This sentence does not have multiple words. ");
        }

        System.out.println("Task 9---------------------------------");

        System.out.println("Please enter a positive number: ");
        int number = scanner.nextInt();
        for (int l = 1; l <= number; l++) {
            if (l % 6 == 0) System.out.println("FooBar");
            else if (l % 2 == 0) System.out.println("Foo");
            else if (l % 3 == 0) System.out.println("Bar");
            else System.out.println(l);
        }

        System.out.println("Task 10 ------------------------------------");

        String originalWay, palindromed = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome");
        originalWay = in.nextLine();

        int length = originalWay.length();

        for (int m = length - 1; m >= 0; m--)
            palindromed = palindromed + originalWay.charAt(m);
        if (length < 1) {
            System.out.println("The word does not have 1 or more characters");

        } else if (originalWay.equals(palindromed))
            System.out.println("The word is a palindrome.");
        else
            System.out.println("The word isn't a palindrome.");

        System.out.println("Task 11-------------------------");

        System.out.println("Please enter a sentence");
        Scanner input1 = new Scanner(System.in);
        String sentence11 = input1.nextLine();


        int countL = 0;


        for (int i = 0; i < sentence11.length(); i++) {
            if (sentence11.toLowerCase().charAt(i) == 'a') countL++;
        }
        if (countL == 0) {
            System.out.println("This sentence does not have any characters");
        }
        System.out.println("This sentence has " + countL + " a or A letters");

    }}