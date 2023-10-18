package T_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T_tryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere sayi giriniz. \nBitirmek icin q'ya basiniz");
        int toplam = 0;
        int sayac1 = 0;
        int sayac2 = 0;
        boolean dongu = true;

        while (dongu) {
            try {
                double girilenSayi = scanner.nextDouble();
                toplam += girilenSayi;
                sayac1++;

            } catch (InputMismatchException e) {
                sayac2++;
                String girilenDeger = scanner.nextLine();
                if (girilenDeger.equalsIgnoreCase("q")) {
                    dongu = false;
                } else {
                    System.out.println("Hatali giris yaptiniz Lutfen sayi giriniz");
                }
            }

        }
        System.out.println("Girilen sayi adeti: " + sayac1 + "\nSayilarin toplami: " + toplam);
        System.out.println("Sayi disinda girilen karakter sayisi: " + sayac2);

    }
}
