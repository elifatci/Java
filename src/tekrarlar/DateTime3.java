package tekrarlar;

import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime3 {
    public static void main(String[] args) {

        LocalTime time1=LocalTime.now();

        System.out.println(time1);


        LocalTime time2=LocalTime.now(ZoneId.of("America/Chicago"));
        System.out.println(time2);

        LocalTime time3=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(time3);

    }
}
