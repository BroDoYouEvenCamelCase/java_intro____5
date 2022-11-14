package projects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project04_Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter valid email");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        System.out.println(validateEmail(email));

    }

    public static boolean validateEmail(String email) {

        Pattern pattern = Pattern.compile("\\w{2,}@\\w{2,}\\.\\S{2,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();



    }





    }



