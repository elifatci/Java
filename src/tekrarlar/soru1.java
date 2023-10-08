package tekrarlar;

import java.util.Random;

public class soru1 {
    public static void main(String[] args) {
            /*
         5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.

         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                Random random = new Random();
                int rastgeleSayi = random.nextInt(9);
                System.out.print(rastgeleSayi + " ");


            }

            System.out.println(" ");
        }
    }
}
