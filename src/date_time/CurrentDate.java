package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("-------------Date Class-----------------------");
        Date date = new Date();
        System.out.println(date);

        System.out.println("-------------Local Date Class-----------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusDays(7));
        System.out.println(localDate.getMonth()); // December
        System.out.println(localDate.getMonthValue()); //12
        System.out.println(localDate.getDayOfWeek());  // sunday
        System.out.println(localDate.getDayOfMonth()); // 11
        System.out.println(localDate.getDayOfYear()); // 345


        System.out.println("------------------Local Time---------------------");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println("------------------Local DateTime Time---------------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
