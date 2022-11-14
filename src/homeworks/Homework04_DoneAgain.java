package homeworks;

import java.util.Scanner;

public class Homework04_DoneAgain {
    public static void main(String[] args) {
        System.out.println("please enter your name ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name.length());

        System.out.println(name.charAt(0));

        System.out.println(name.charAt(name.length()-1));

        System.out.println(name.substring(0,3));

        System.out.println(name.substring(name.length()-3));

        if(name.toLowerCase().startsWith("a")) {
            System.out.println("You are in the club ");
        }else System.out.println("Sorry you are not in the club");

        System.out.println("Task 2----");

        System.out.println("please enter address");
        String address = scan.nextLine();

        if(address.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club ");
        }else if (address.toLowerCase().contains("Des PLaines")){
            System.out.println("You are welcme to join the club ");
        }else {
            System.out.println(("Sorry you will never be in the club"));
        }

        System.out.println("task 3-----------------");

        System.out.println("Enter fav colors at least 4 ");

        String favColors = scan.nextLine();

        if(favColors.toLowerCase().contains("red") && favColors.toLowerCase().contains("Green")) {
            System.out.println("Green and red are in the list ");
        } else if(favColors.toLowerCase().contains("green")) {
            System.out.println("Green is in the list ");
        } else if(favColors.toLowerCase().contains("red")) {
            System.out.println("red is in the list ");
        }else System.out.println(("green and red are not in the list"));

        System.out.println("Taask 4-------------------------");

        String str = "   Java is FUN  ";

        str.toLowerCase().trim();

        // java is fun





    }
}
