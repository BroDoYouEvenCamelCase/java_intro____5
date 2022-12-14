package recursion;

public class UnderstandingRecursion {
    public static void main(String[] args) {
        //print(); stackoverflowerror
    }

    public static void print(){
        System.out.println("Hello");
       print();
    }

    // create a method that prints numbers from 1-given number
    // iterative way
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbersRecursively(int n) {
        if(n == 1) return;
        printNumbersRecursively(n-1);
        System.out.println(n);

    }}
