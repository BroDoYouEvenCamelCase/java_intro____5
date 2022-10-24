package practice.loopsPractice;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class WhileLoopsPractice {
    public static void main(String[] args) {

   int random = RandomNumberGenerator.getARandomNumber(1,20);
        System.out.println("Random number = " + random);

        while (random != 7) {
            random = RandomNumberGenerator.getARandomNumber(1,20);

            System.out.println("random number = " + random);
        }
        System.out.println("Congrats you hit the number:" + random);





    }
    }
