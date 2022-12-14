package recursion;

public class Practice02_ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));

    }
    /*
    Create a method reverse
    It takes one String and returns it back reversed
    User recursion
     */

    public static String reverse(String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
