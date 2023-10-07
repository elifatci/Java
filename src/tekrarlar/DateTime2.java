package tekrarlar;

import java.time.LocalDateTime;

public class DateTime2 {
    public static void main(String[] args) {

        LocalDateTime loopBasi=LocalDateTime.now();
        System.out.println(loopBasi);

        int toplam=0;
        for (int i = 0; i < 1000; i++) {
            toplam+=i*i;

        }
        System.out.println(toplam);
        LocalDateTime loopSonu=LocalDateTime.now();
        System.out.println(loopSonu);

        int nanoSaniye=loopSonu.getNano()-loopBasi.getNano();

        System.out.println(nanoSaniye);
    }
}
