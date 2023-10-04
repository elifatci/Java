package tekrarlar;

import java.time.LocalDate;
import java.time.Period;

public class DateTime1 {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 3, 5);
        LocalDate birthday1 = LocalDate.of(1960, 7, 23);

        System.out.println(birthday1.isBefore(birthday));
        System.out.println(birthday.isAfter(birthday1));

        System.out.println(birthday.lengthOfYear());

        System.out.println(birthday.getMonth());
        System.out.println(birthday1.getDayOfYear());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday1.getDayOfWeek());

        Period age = Period.between(today, birthday1);
        System.out.println(age);

        Period age1 = Period.between(today, birthday);
        System.out.println(age1);


    }
}
