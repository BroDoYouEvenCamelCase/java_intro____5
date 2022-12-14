package enum_practices;

import java.time.Month;

public class TestCustomEnums {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);


       Days[] days=  Days.values();
        for (Days d : days) {
            System.out.println(d);

        }

        System.out.println(Month.JANUARY);

        Month[] month = Month.values();
        for (Month month1 : month) {
            System.out.println(month1);

        }
    }
}
