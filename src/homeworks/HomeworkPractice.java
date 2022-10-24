package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class HomeworkPractice {
    public static void main(String[] args) {


        System.out.println("Task 8--------------------------------");

        Scanner scanner = new Scanner(System.in);

        int input =0;
        int sum = 0;

        do {
            System.out.print("Hey User Enter number: ");
            input = scanner.nextInt();
            if (input >= 100) {
                System.out.println("Number is already more than 100");
                break;
            }
            if (sum + input <= 100)
                sum += input;

        } while (sum < 100);

        System.out.println("Sum of Numbers : " + sum);

        int userData= 7, fib1 = 0, fib2 = 1;
        String resultTask9 = "";

        System.out.println("Fibonacci to " +userData);

        for (int f = 1; f <= userData; ++f) {

            System.out.print(resultTask9 + fib1 + " - ");

            int Fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = Fibonacci;
            System.out.println(resultTask9.substring(0, resultTask9.length()-3));


        }}}
