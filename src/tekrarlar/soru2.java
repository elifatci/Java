package tekrarlar;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
      Kullanicidan kac tane sayinin ortalamasini bulmasini istedigini sorun
      ve buna bagli olarak aldiginiz degerleri bir array'de saklayin. kullancidan verileri aldikran sonra
      tum sayilari ve ortalamasini yazdirin
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ortalamasini bulmak istediginiz sayi adetini giriniz");
        int sayiAdeti = scanner.nextInt();
        int sayilar[] = new int[sayiAdeti];
        int toplam = 0;


        for (int i = 0; i < sayiAdeti; i++) {
            System.out.println(i + 1 + ". sayiyi giriniz");
            sayilar[i] = scanner.nextInt();

        }
        System.out.println("Sayilar:");
        for (int i = 0; i < sayiAdeti; i++) {
            System.out.println(sayilar[i] + " ");
            toplam += sayilar[i];

        }
        System.out.println("Sayilarin ortalamasi: " + (double) toplam / sayiAdeti);


    }
}
