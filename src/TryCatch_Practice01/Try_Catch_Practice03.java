package TryCatch_Practice01;

public class Try_Catch_Practice03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,5};

        int sixthNumber = array[5];

        int result = sixthNumber * 5;

        System.out.println(result);

        try{
            System.out.println(result);

        }
        catch(ArrayIndexOutOfBoundsException e ){
            e.printStackTrace();
    }

        System.out.println("End of the program");
}}
