package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedList {
    // Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not girme islemi
    //bittiginde Q’ya basmalidir. Not girme islemi bittikten sonra asagidaki sekilde
    //output hazirlayin
    //not ortalamasi : …..
    //ogrenci sayisi : …..
    //ortalama altindaki ogrenci sayisi : ….

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ogrenciNotOrtalamasi = new ArrayList<>();
        int notOrtalamasi = 0;
        int ortalamaAlti = 0;
        int ogrenciSayisi = 0;

        System.out.println("Lutfen ogrencilerin notlarini giriniz. İşleminiz bittiginde Q'ya basiniz");
        while (true) {
            String notlar = scanner.next();
            if (notlar.equalsIgnoreCase("Q")) {
                break;
            }
            int not = Integer.parseInt(notlar);
            ogrenciNotOrtalamasi.add(not);
            ogrenciSayisi = ogrenciNotOrtalamasi.size();
        }

        for (int i = 0; i < ogrenciNotOrtalamasi.size(); i++) {
            notOrtalamasi += ogrenciNotOrtalamasi.get(i);
        }
        notOrtalamasi /= ogrenciNotOrtalamasi.size();

        for (int i = 0; i < ogrenciNotOrtalamasi.size(); i++) {
            if (ogrenciNotOrtalamasi.get(i) < notOrtalamasi) {
                ortalamaAlti++;
            }
        }


        System.out.println("Ogrencilerin Not Ortalamasi: " + ogrenciNotOrtalamasi);
        System.out.println("Ogrenci Sayisi: " + ogrenciSayisi);
        System.out.println("Not ortalamasi: " + notOrtalamasi);
        System.out.println("Ortalama altindaki ogrenci sayisi: " + ortalamaAlti);
    }

}



