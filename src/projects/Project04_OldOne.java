package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04_OldOne {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1 ----------------------------");

        System.out.println("Please enter a String");
        String str = scanner.nextLine();
        if (str.length() < 8) {
            System.out.println("This String does not have 8 characters");
        }
        else {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) + str.substring(0, 4));
        }

        System.out.println("Task 2-----------------------------");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = inputReader.nextLine();

        if (sentence.length() <=1) {
            System.out.println("This sentence does not have 2 or more words to swap ");
        }
        else {
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
        System.out.println(str2.replace(badWord2,goodWord));
        System.out.println(str3.replace(badWord1,goodWord).replace(badWord2,goodWord));

        System.out.println("Task 4-------------------------");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length()/2-1, name.length()/2+1));
            else System.out.println(name.charAt(name.length()/2));
        }else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("Task 5 -----------------------------------------");

        System.out.println("Please enter a country");
        String country = scanner.nextLine();
        if (country.length() >= 5) System.out.println(country.substring(2, country.length()-2));
        else System.out.println("Invalid input!!!");

        System.out.println("Task 6---------------------------------------------");
        String address = ScannerHelper.getAnAddress();

        System.out.println(address.replace("a","*")
                .replace("A", "*").replace("e","#")
                .replace("E", "*").replace("i","+")
                .replace("I","+").replace("u","$")
                .replace("U","$").replace("o", "@")
                .replace("O","@"));


        System.out.println("Task 7 -----------------------------");

        int randomNum1 = (int)(Math.random() * 26);
        int randomNum2 = (int)(Math.random() * 26);
        String result = "";
        for (int i = Math.min(randomNum1, randomNum2); i <= Math.max(randomNum1, randomNum2) ; i++) {
            if (i % 5 != 0) result += i + " - ";
        }
        System.out.println(result.substring(0, result.length()-3));

        System.out.println("Task 8-----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sentenceNr8 = input.nextLine();

        int wordCount = 0;

        for(int i = 0; i < sentenceNr8.length()-1; i++) {

            if (wordCount <=2 ) {
                System.out.println("This sentence has 2 words.");
            }else if(sentenceNr8.charAt(i) == ' ' && Character.isLetter(sentenceNr8.charAt(i+1)) && (i > 0)) {
                wordCount++;

            }

            wordCount++;

            System.out.println("Total number of words in the given string: " + wordCount);


            System.out.println("Task 9---------------------------------");

        System.out.println("Please enter a positive number: ");
        int number = scanner.nextInt();
        for (int l = 1; l <= number; l++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);

            System.out.println("Task 10-------------------------");
            String originalWay, palindromed = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string to check if it's a palindrome");
            originalWay = in.nextLine();

            int length = originalWay.length();

            for (int m = length - 1; m >= 0; m--)
                palindromed = palindromed + originalWay.charAt(m);
            if(length <1 ) {
                System.out.println("The word does not have 1 or more characters");

            } else if (originalWay.equals(palindromed))
                System.out.println("The word is a palindrome.");
            else
                System.out.println("The word isn't a palindrome.");


            System.out.println("Task 11-------------------------");

            System.out.println("Please enter a sentence");
            Scanner scanner1 = new Scanner (System.in);
            String sentenceTask11 = scanner1.nextLine();


            char reqChar1 = 'a' ;
            char reqChar2 = 'A';
            int charCount = 0;

            int count = 0;
            if ( charCount <= 1 ) {
                System.out.println("This sentence does not have any characters ");
            }
            for (int p = 0; p < sentenceTask11.length(); p++) {
                if (sentenceTask11.charAt(i) == reqChar1 ) {
                    count++;
                }else if (sentenceTask11.charAt(i) == reqChar2) {
                    count ++;
                }

            }
            System.out.println("This sentence has " + count + " a or A letters");

        }

    }}}












