package udemy;

import java.util.Scanner;

public class workbook_2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you first name");
        String fname =scan.nextLine();
        System.out.println("First name: " + fname);


        System.out.println("Please enter you last name");
        String lName = scan.nextLine();
        System.out.println("Last name: " + lName);


        System.out.println("Please enter you age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Age: " + age);


        System.out.println("Please enter your username");
        String username = scan.nextLine();
        System.out.println("Username: " + username);


        System.out.println("Please enter your city");
        String city = scan.nextLine();
        System.out.println("City: " + city);


        System.out.println("Please enter your country");
        String country = scan.nextLine();
        System.out.println("Country: " + country);


    }
}
