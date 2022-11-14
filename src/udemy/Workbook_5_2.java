package udemy;

import java.util.Scanner;

public class Workbook_5_2 {
    public static void main(String[] args) {
        System.out.println("Please enter a line you want to write");
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        String bartLine = scan.nextLine();
        for (int i = 1; i <= 99; i++) {
            System.out.println(counter++ +"." + bartLine );

        }
    }
}
