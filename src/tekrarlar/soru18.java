package tekrarlar;

import java.util.*;

public class soru18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen desimal bir sayi giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println("Girdiginiz " + girilenSayi + " desimal sayisinin binary degeri: " + binarydeger(girilenSayi));

    }

    public static List<Integer> binarydeger(int girilenSayi) {

        List<Integer> list = new ArrayList<>();
        while (girilenSayi >= 1) {
            list.add(girilenSayi % 2);
            girilenSayi /= 2;

        }
        Collections.reverse(list);

        return list;
    }
}



