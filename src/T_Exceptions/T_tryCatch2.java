package T_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T_tryCatch2 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 9, 12, 15};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 0-5 arasi bir sayi giriniz");

        try {
            int girilenSayi = scanner.nextInt();
            int sayi = numbers[girilenSayi];
            System.out.println(girilenSayi + ".index: " + numbers[girilenSayi]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Gecersiz giris Hata: " + e.getMessage());
        }

    }

}

