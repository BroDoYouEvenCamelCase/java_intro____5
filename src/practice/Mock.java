package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Mock {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();
        int prevNum = 1;
        int currentNum = 1;
        int nextNum = 0;
        String answer = "";

        for ( int i = 0; i < num; i ++); {
            answer += currentNum + " - ";

            prevNum = currentNum;
            currentNum = nextNum;
            nextNum = currentNum + prevNum;

        }

        System.out.println("Next num in sequence is " + answer.substring(answer.length()-3));
    }}








