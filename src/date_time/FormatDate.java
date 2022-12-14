package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

    public static void main(String[] args) {
        System.out.println("=======================Formatting Date-----------------------");

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("");
        System.out.println(formatter.format(date));

        // print the date in the format of yyyy

        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy");
        System.out.println(formatter2.format(date));


    }
}
