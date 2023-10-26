package tekrarlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru9 {
    public static List<Integer> tamBolen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        List<Integer> lst = new ArrayList<>();
        for (int i = 2; i < girilenSayi; i++) {
            if (girilenSayi % i == 0) {
                lst.add(i);
            }
        }

        return lst;
    }

    public static void main(String[] args) {
        List<Integer> lst2 = new ArrayList<>();

        lst2 = tamBolen();
        System.out.println(lst2);
    }
}
