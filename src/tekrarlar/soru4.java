package tekrarlar;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz harfleri,
        // kelimeyi ve tekrarsiz halini yazdirip
        // kelimede kullanilan farkli harf sayisini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine().toLowerCase();

        String tekrarsizMetin = "";

        metin = metin.replaceAll("\\s", "");


        for (int i = 0; i < metin.length(); i++) {
            if (!tekrarsizMetin.contains(metin.substring(i, i + 1))) {
                tekrarsizMetin += metin.substring(i, i + 1);
            }

        }
        System.out.println("Metnin yeni hali: " + tekrarsizMetin);
        System.out.println("Toplam harf sayisi: " + tekrarsizMetin.length());
    }
}
