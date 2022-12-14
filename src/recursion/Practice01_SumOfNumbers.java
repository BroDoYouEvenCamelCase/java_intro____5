package recursion;

public class Practice01_SumOfNumbers {

    /*
    create a public static method called as sum
    it takes an int which is a positive number
    It returns the sum of numbers starting from 1 to given int
     */

    public static void main(String[] args) {
        int num = 5;
        int sum = sum(num);
        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
    }


    public static int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;



        

}   }
