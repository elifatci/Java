package tekrarlar;

import java.util.Arrays;
import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scanner.nextLine();

        System.out.println("Lutfen bir harf giriniz");
        String girilenHarf = scanner.next().toLowerCase();

        String[] arr = girilenCumle.split("");
        int sayac = 0;
        for (String each : arr) {
            if (each.equalsIgnoreCase(girilenHarf)) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Girdiginiz harf cumlede kullanilmamistir");
        }
        System.out.println("Girdiginiz cumlede " + girilenHarf + " harfi " + sayac + " tane kullanilmistir.");
    }
}
