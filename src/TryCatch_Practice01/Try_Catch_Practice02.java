package TryCatch_Practice01;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Try_Catch_Practice02 {
        /*
        Write a program that gets 2 numbers from the user as ints
        Then divide these numbers and print the results

        Print a message saying "End of the program"

         */
        public static void main(String[] args) {
            int num1 = ScannerHelper.getANumber();
            int num2 = ScannerHelper.getANumber();

            System.out.println(num1/num2);
            System.out.println("End of program");

            try{
                System.out.println(num1/num2);

            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
}
