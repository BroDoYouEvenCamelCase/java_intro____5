package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {

            System.out.println("Task 1 --------------------");
            String str = "Tech Global";
            System.out.println(noSpace(str));

            System.out.println("Task 2 ----------------------");
            String str2 = "   A    ";
            System.out.println(replaceFirstLast(str2));

        System.out.println("Task 3-----------------------------");
        String str3 = "aeiou";
        System.out.println(hasVowel(str3));

        System.out.println("TASK 4------------------------------");
        checkAge(1920);

        System.out.println("Task 5---------------------------");
        System.out.println(averageOfEdges(-3, 15, -3));

        System.out.println("Task 6-----------------------");

        String[] arr = {"appium","123","ABC","java"};

        System.out.println(Arrays.toString(noA(arr)));

        System.out.println("TASK 7---------------------");

        int[] array = {10,11,12,13,14,15};
        System.out.println(Arrays.toString(no3or5(array)));

    }

        public static String noSpace(String str) {


            str = str.replaceAll("\\s+", "").trim();
            return str;

        }


        public static String replaceFirstLast(String str2){
            str2 = str2.trim();
            if (str2.length() < 2) return "";
            else
                return str2.charAt(str2.length() - 1) + str2.substring(1, str2.length() - 1) + str2.charAt(0);
        }

        public static boolean hasVowel(String str3){


                return str3.toLowerCase().contains("a") || str3.toLowerCase().contains("e") ||
                        str3.toLowerCase().contains("i") || str3.toLowerCase().contains("o") || str3.toLowerCase().contains("u");
            }

            public static void checkAge (int yearOfBirth){

                int currentYear = 2022;
                int age = currentYear-yearOfBirth;

                if(age >100 || currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
                else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
                else System.out.println("AGE IS ALLOWED");

        }

        public static int averageOfEdges(int a, int b, int c){

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        return (min+max)/2;
        }

    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a"))
                arr[i] = "###";
        }
        return arr;
        }

        public static int[] no3or5(int[] numbers) {

            for (int i = 0; i < numbers.length ; i++) {
                if(numbers[i] % 15 == 0)
                    numbers[i] = 101;
                else if(numbers[i] % 5 == 0)
                    numbers[i] = 99;
                else if(numbers[i] % 3 == 0 )
                    numbers[i] = 100;



            }

            return numbers;


        }
    }



