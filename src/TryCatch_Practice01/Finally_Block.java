package TryCatch_Practice01;

public class Finally_Block {
    public static void main(String[] args) {

        String greeting = "hello";
        try{
            "hello".charAt(10);
        }catch (Exception e){
            greeting.charAt(9);
        }
        finally {

        System.out.println("End of the program");
    }}
}
