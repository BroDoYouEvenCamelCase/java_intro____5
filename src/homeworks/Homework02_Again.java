package homeworks;

import java.util.Scanner;

public class Homework02_Again {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Please enter two numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);

        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        System.out.println("Task 2------------------------------------");

        System.out.println("Please enter two numbers ");
        int numb1,numb2;

        numb1= scan.nextInt();
        numb2 = scan.nextInt();
        System.out.println("The product of the given 2 numbers is : " + (numb1 * numb2));

        System.out.println("Task 3--------------------------------------");

        System.out.println("Enter two floating numbers");
        double number1, number2;

        number1 = scan.nextDouble();
        number2 = scan.nextDouble();

        System.out.println("The sum of the given numbers is = " + (number1 + number2));
        System.out.println("The product of the given number is = " + (number1 * number2));
        System.out.println("The subtraction of the given number is = " + (number1 - number2));
        System.out.println("THe division of the given number is = " + (number1/number2));
        System.out.println("The remainder of the given number is = " + (number1% number2));

        System.out.println("Task 4---------------------------------");

        System.out.println(-10 + (7 * 5));
        System.out.println((72 + 24) % 24);
        System.out.println(10 + (-3 * 9) / 9);
        System.out.println(5 + (18 / 3) * 3);

        System.out.println("Task 5---------------------");

        System.out.println("Etner two numbers");

        int n, n1;
        n = scan.nextInt();
        n1 = scan.nextInt();
        System.out.println("The average of the given numbers is :" + (n + n1) /2);

        System.out.println("Task 6-----------------------");

        int no1,no2,no3,no4,no5;

        no1 = scan.nextInt();
        no2 = scan.nextInt();
        no3 = scan.nextInt();
        no4 = scan.nextInt();
        no5 = scan.nextInt();

        System.out.println(("The average of the given numbers is : " + (no1 + no2 + no3+ no4+ no5)/ 5));

        System.out.println("Task 7------------------------------------");

        int nu1, nu2, nu3;

        nu1 = scan.nextInt();
        nu2 = scan.nextInt();
        nu3 = scan.nextInt();

        System.out.println("The" + nu1 + "multiplied with " + nu1 + "= " +(nu1 * nu1));
        System.out.println("The" + nu2 + "multiplied with " + nu2 + "= " +(nu2 * nu2));
        System.out.println("The" + nu3 + "multiplied with " + nu3 + "= " +(nu3 * nu3));

        System.out.println("Task 8--------------------------------");

        int side = scan.nextInt();

        System.out.println("perimiter of the square = " + side * side);
        System.out.println("area of square = " + side * 4);

        System.out.println("Task 9----------------------------------");

        double annualSalary = 90000;

        System.out.println("A Software Engineer in Test can earn " + annualSalary*3 + "in three years");

        System.out.println("Task 10---------------------------------");

        String favBook, favColor;
        int num;
        num = scan.nextInt();
        favBook = scan.nextLine();
        favColor = scan.nextLine();

        System.out.print("User's favorite book is : " + favBook +
                "\n User's favorite color is: " + favColor +
                "\n User's favorite number is : " + num);

        System.out.println("task 11----------------------------");

        String fname, lName, email,phoneNumber, address;
        int age;

        System.out.println("What is your first name? ");
        fname = scan.nextLine();
        System.out.println("What is your last name");
        lName = scan.nextLine();
        System.out.println("What is your age");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your email");
        email = scan.nextLine();
        System.out.println("What is your phone number?");
        phoneNumber = scan.nextLine();
        System.out.println("What is your address");
        address=scan.nextLine();

        System.out.print("\t User who joined this program is " + fname + lName +"." + fname+"'s" + "age is" +
                "\n" + age+"." + fname + "email address is " + email + ", phone number" +
                "\n is " + phoneNumber + ", and address is " + address);



    }

}
