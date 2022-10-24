package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05_Practice {
    public static void main(String[] args) {
        System.out.println("Task 1-----------------------------");
        String answer = "";
        for ( int i =1; i <=100; i ++) {
            if( i % 7 == 0) answer += i + "- ";
        }
        System.out.println(answer.substring(0,answer.length()-3));

        System.out.println("Task 2------------------------------");

        String answer1 = "";
        for ( int i = 1; i <= 50; i ++) {
            if( i % 2 == 0 && i % 3 == 0) answer1 += i + " - ";
        }
        System.out.println(answer1.substring(0,answer1.length()-3));

        System.out.println("Task 3-----------------------------------");

        String answer2 = "";
        for (int i = 100; i >=50; i--) {
            if(i % 5 == 0) answer2 += i + " - ";
        }
        System.out.println(answer2.substring(0,answer2.length()-3));

        System.out.println("Task 4-------------------------------------");
        for ( int i = 0; i <= 7; i ++) {
            System.out.println("The square root of " + i + " is = " + (i*i));

        }

        System.out.println("Task 5--------------------------------------");
        int sum = 0;
        for ( int i = 1; i <=10; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("task 6-------------------------------------");

        int num = 1, factorial =1;
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;


        }


    }}
