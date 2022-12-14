package TryCatch_Practice01;

import utilities.ScannerHelper;

public class TryCatch_Practice01 {
    public static void main(String[] args) {

        /*
        get name from user and print 4th character of the name
        Then say Hello{name}
         */
        String name = ScannerHelper.getAName();
        try{
            System.out.println(name.charAt(3));

        }
        catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
            // add to logger
        }

        System.out.println("Hello " + name);
    }
}
