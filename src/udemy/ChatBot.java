package udemy;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hi " + name+"!" + " I'm Javabot. Where are you from?" );
        String city = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("So you're " + age+", cool I'm 400 years old." );
        System.out.println("This means I'm 8 times older than you.");
        System.out.println("Enough a bougt me. What's yyour favorite language? (just don't say Python)");
        String favProgram = scan.nextLine();

        System.out.println(favProgram +", that's great! Nice chatting with you" +name +". I have to log off now. See ya! ");
    }
}
