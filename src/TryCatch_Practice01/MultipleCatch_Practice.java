package TryCatch_Practice01;

public class MultipleCatch_Practice {
    public static void main(String[] args) {

        String name = null;
        int age = 25;

        /*
        get first character from the name and print it
        Divide the age by 0 and print result
        print {name}'s age is {age}.

         */

        try {
            System.out.println(name.charAt(0));
        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }

        try {
            System.out.println(age / 0);
        }catch(ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
        System.out.println(name + "'s" + "age is " + age + ".");

    }
}
