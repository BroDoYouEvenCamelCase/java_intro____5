package arrays;

public class _04_CountElements_inIntArray {
    public static void main(String[] args) {
        int [] numbers = { -1, 3, 0 , 5, -7 , 10 , 8 , 0, 10, 0};

        /*
        negatives: 2
        positives: 5
        neutral or zeros: 3

        even: 6
        odd:4

        max: 10
        min: -7

        sum of the numbers: 28
        How many of these numbers are represented in fibonacci sequence: 6
        how many unique numbers: 7
        prime number: 2
        how many can be divided by 5: 6
        asolte diff between max and min: 18
        closest number to 9( take the left if you have two
         */
        int negatives = 0;

        for ( int number : numbers) {
            if( number < 0) negatives ++;
        }

        System.out.println("There are " + negatives + " negative numbers in this array" );

        int positives = 0;

        for ( int number : numbers) {
            if (number > 0) positives++;
        }

        System.out.println("There are " + positives + " positives");

      //Count how many even numbers
        //expected: 6

        System.out.println("Task2-------------------------------------------------");
        int evens = 0;

        for ( int number : numbers) {
            if (number %2 == 0) evens++;
        }

        System.out.println("There are " + evens + " evens");


        int even1 =0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;

        }
        System.out.println(even1);
        }
}
