package date_time;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        /*
        Ask uer to enter their age and find their year of birth
         */



                Scanner scanner = new Scanner(System.in);


                System.out.print("Enter your age: ");
                int age = scanner.nextInt();


        LocalDate localDate = LocalDate.now();

            int year  = localDate.getYear() - age;




                System.out.println("You were born in " + year);

                // ask user to enter their year of birth

                // calculate thier age
                // currentYear - yearOfBirth


                Scanner scanner1 = new Scanner(System.in);

        System.out.println("please enter date of the year");

        int dateOfYear = scanner.nextInt();

        System.out.println(LocalDate.now().getYear() - dateOfYear);
            }
        }





