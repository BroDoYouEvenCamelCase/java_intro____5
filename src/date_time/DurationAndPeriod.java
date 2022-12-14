package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {


        /*
        How many days have passed since you were born
        currentDate - dateOfBirth

        HOw many years passed
        How many months passed
        How many weeks passed
        How many days passed

         */

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1992,11,02);

        System.out.println(today);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth,today).getYears()); // 30
        System.out.println(Period.between(dateOfBirth,today).getMonths()); //3
        System.out.println(Period.between(dateOfBirth,today).getDays());  // 9

        //Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today)); // 30
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth,today)); // 361
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth,today)); // 1570
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth,today)); // 10996

        LocalTime localTime1 = LocalTime.of(12,44,15);
        LocalTime localTime2 = LocalTime.of(13,45,45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        // chrono unit
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));     // 1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));   // 61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));   // 3690

    }
}
