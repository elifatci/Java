package tekrarlar;

import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {

        carpim(12, 23, "J", "a", "v", "a");
        carpim(2, 5, "v", "a", "r", "a", "r", "g", "s");
        carpim(10, 5, " ");

    }

    public static void carpim(int sayi1, int sayi2, String... metin) {

        System.out.println(sayi1 * sayi2 * (metin.length));

    }

}
        






