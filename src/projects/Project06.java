package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("Task 1 ------------------------------------------");

        String[] words = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("Task 2 -----------------------------------------");

        int[] array = { 2,-5,6,7,-10,-78,0,15 };
        System.out.println(Arrays.toString(removeNegatives(array)));

        System.out.println("Task 3------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c[] = str.toCharArray();
        System.out.println(validatePassword(c));

        System.out.println("Task 4--------------------------------------------");

        System.out.println("Please enter valid email");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        System.out.println(validateEmail(email));

    }

    public static int countMultipleWords(String[] arr) {

        Pattern pattern = Pattern.compile("(?i)\\b[a-z]+\\b");

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            int temp = 0;

            while(matcher.find()) {
                temp++;
            }

            if(temp > 1) count++;
        }

        return count;
    }

    public static int[] removeNegatives(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : num) {
            if (n >= 0) {
                list.add(n);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }

    public static String validatePassword(char c[]) {
        int counter = 0;
        if(c.length < 6 || c.length > 20){
            return "Invalid";
        }
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] == '@' || c[i] == '#' || c[i] == '$'|| c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6'|| c[i] == '7'|| c[i] == '8'|| c[i] == '9'){
                counter = 0;
                break;
            }
            counter = 1;
            if(counter == 1){
                return "Invalid";
            }
        }
        return "Valid";
    }


    public static boolean validateEmail(String email) {

        Pattern pattern = Pattern.compile("\\w{2,}@\\w{2,}\\.\\S{2,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();



    }
}





