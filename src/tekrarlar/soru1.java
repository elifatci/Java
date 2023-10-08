package tekrarlar;

import java.util.Random;

public class soru1 {
    public static void main(String[] args) {
            /*
         5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.

         */

        int[][] sayi = new int[5][5];
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Random random = new Random();
                int rastgeleSayi = random.nextInt(9);
                sayi[i][j] = rastgeleSayi;
                System.out.print(rastgeleSayi + " ");


                if (i == j) {
                    toplam1 += sayi[i][j];
                }
                if (i+j==4) {
                    toplam2+=sayi[i][j];

                }

            }
            System.out.println(" ");
        }
        System.out.println("toplam1: " + toplam1);
        System.out.println("toplam2: "+ toplam2);
    }
}
