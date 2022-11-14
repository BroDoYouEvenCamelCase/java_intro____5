package udemy;

import java.util.Scanner;

public class Workbook_5_5 {
    public static void main(String[] args) {
        System.out.println("I hear you like to count by threes");

        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Pick a number to count by: " + number1);

        int number2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Pick a number to start counting from :" +number2);

        int number3 = scan.nextInt();;
        scan.nextLine();
        System.out.println("Pick a number to count to: " + number3);

        int counter = 3;
        for (int i = 6; i <=66 ; i+=3) {
            System.out.println(i );


        }

        }


    }

