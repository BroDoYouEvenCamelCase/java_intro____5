package udemy;

import java.util.Scanner;

public class Workbook_3_7 {
    public static void main(String[] args) {
        System.out.println("Are you here to get a mortgage? (yes or no");
        Scanner scan = new Scanner(System.in);
        String decision = "Yes";

        if(decision.equals("Yes")) {
            System.out.println("Great! How much do you have in your savings and credit debt?");
        }else {System.out.println("Ok have a nice day!");}

        int savings = scan.nextInt();
        System.out.println(savings);
        int debt = scan.nextInt();
        scan.nextLine();

        int yearsWorked = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();

        if( savings <= 10000 && debt <=5000 && yearsWorked >= 2) {
            System.out.println("Congrats" + name + " been approved");
        }else {
            System.out.println("Sorry! ");
        }


}}
