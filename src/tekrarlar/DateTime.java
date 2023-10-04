package tekrarlar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTime {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        //plus
        System.out.println(today.plusWeeks(13));
        System.out.println(today.plusYears(2).plusDays(23));

        //minus
        System.out.println(today.minusYears(2));
        System.out.println(today.minusMonths(4).minusWeeks(2).minusDays(10));

        //with
        System.out.println(today.withMonth(5));
        System.out.println(today.withDayOfYear(100));

        //isLeap ==>true/false
        LocalDate trh = LocalDate.of(1900, 9, 15);
        LocalDate trh1 = LocalDate.of(2004, 1, 4);
        System.out.println(today.isLeapYear());
        System.out.println(trh.isLeapYear());
        System.out.println(trh1.isLeapYear());


    }
}
