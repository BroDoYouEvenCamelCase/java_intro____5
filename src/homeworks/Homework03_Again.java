package homeworks;

import java.util.Scanner;

public class Homework03_Again {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println(Math.abs(number1 - number2));

        System.out.println("Task 2--------------------------------");

        System.out.println("Please enter 5 numbers");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       int num3 = scan.nextInt();
       int num4 = scan.nextInt();
       int num5= scan.nextInt();
        System.out.println("Max value = " + Math.max(num1, (Math.max(Math.max(num2, num3), Math.max(num4, num5))) ));
        System.out.println("Min value = " + Math.min(num1, (Math.min(Math.min(num2,num3), Math.min(num4,num5)))));

        System.out.println("Task 13-------------------------------");

        System.out.println("please enter a number");
        int dayOfWeek = scan.nextInt();

        switch(dayOfWeek) {
            case (1):
                System.out.println("Monday");break;
            case(2):
                System.out.println("Tuesday"); break;
            case(3):
                System.out.println("Wednesday"); break;
            case(4):
                System.out.println("Thursday"); break;
            case(5):
                System.out.println("Friday"); break;
            case(6):
                System.out.println("Saturday"); break;
            case(7):
                System.out.println("Sunday"); break;
            default:
                 break;
         }
        System.out.println("Task 14--------------------------");
        int exam1, exam2, exam3;

        exam1 = scan.nextInt();
        exam2 = scan.nextInt();
        exam3 = scan.nextInt();

        int average = (exam1 + exam2 + exam3) /3;

        if(average >= 70) {
            System.out.println("you passed");
        }else if(average < 70) {
            System.out.println("You failed");
        }

        System.out.println("Task 15----------------------------");
        System.out.println("Enter 3 numbers ");
        int numb1, numb2, numb3;

        if(num1 == num2 && num1 == num3) {
            System.out.println("TRiple match");
        }else if(num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("double match");
        }else System.out.println("No match ");
    }
}
