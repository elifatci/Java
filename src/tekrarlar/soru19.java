package tekrarlar;

import java.util.Arrays;
import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lutfen kac tur dondurma oldugunu giriniz: ");

        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        System.out.print("Lutfen dondurma miktarlarini giriniz: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }
        Arrays.sort(a);
        for (int j = 1; j < n; j++) {
            sum += a[j];
        }
        System.out.print(sum);

    }
}
