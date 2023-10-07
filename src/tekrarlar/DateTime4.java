package tekrarlar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime4 {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        DateTimeFormatter istenenFormat=DateTimeFormatter.ofPattern("YYYY M dd EEEE");
        System.out.println(ldt.format(istenenFormat));

        DateTimeFormatter istenenFrmt=DateTimeFormatter.ofPattern("dd M YYYY EEEE H:m a");
        System.out.println(ldt.format(istenenFrmt));
    }
}
