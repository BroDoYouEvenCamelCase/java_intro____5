package TryCatch_Practice01.custom_exceptions;

import utilities.ScannerHelper;

import java.util.Scanner;

public class TestPermission {
    public static void main(String[] args) {
        /*

         */
        int age = ScannerHelper.getAnAge();

        try {

            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("You are only " + age + ".");
        }

        



        }
}
