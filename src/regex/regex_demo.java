package regex;

import java.util.Scanner;

public class regex_demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String color = scan.nextLine();

        switch(color) {
            case "blue":
                System.out.println("Its blue"); break;
            case"green":
                System.out.println("green"); break;
            case"red":
                System.out.println("red"); break;
            case"yella":
                System.out.println("yella"); break;
            default:
                System.out.println("That is problematic ");
        }

        }
    }

