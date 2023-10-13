package tekrarlar;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        // Bir kelime isteyip indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word");
        String word = scanner.next();

        int sayac = 0;
        while (sayac <= word.length() - 1) {
            if (sayac % 2 == 1) {
                System.out.println(sayac + ". index: " + word.charAt(sayac));
            }
            sayac++;
        }
    }
}
