package udemy;

import java.util.Scanner;

public class Workbook_5_9 {
    public static void main(String[] args) {
        String username = "Samantha"; String password = "Java<4";
        System.out.println("Welcome to Javagram! Please sign in below");

        Scanner scan = new Scanner(System.in);
        String username1 = scan.nextLine();
        String password1 = scan.nextLine();

        while( !username1.equals(username) && !password1.equals(password)) {

            System.out.println("Incorrect please try again");

            username1= scan.nextLine();
            password1= scan.nextLine();
        }
        System.out.println("Success");

    }
}
