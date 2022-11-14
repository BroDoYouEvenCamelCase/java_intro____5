package udemy;

import java.util.Scanner;

public class Workbook_5_3 {
    public static void main(String[] args) {

        System.out.println("Hey Timmy! Choose a number to count to:" );
        Scanner scan = new Scanner(System.in);
        int timmyNumber =scan.nextInt();
        scan.nextLine();

        System.out.println("Hey Timmy! Choose a number to count to:" + timmyNumber );

        for (int i = 0; i <= 7; i++) {
            System.out.println(i);

        }



    }
}
