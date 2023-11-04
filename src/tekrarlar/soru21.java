package tekrarlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru21 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Kac kez yarisa katildiniz");
        int yarisSayisi = scan.nextInt();
        int[] yarisPuanlari = new int[yarisSayisi];
        int rekor = 0;

        for (int i = 0; i < yarisSayisi; i++) {

            System.out.println(i + 1 + ". yaris puanini giriniz: ");
            yarisPuanlari[i] = scan.nextInt();

        }
        int maxPuan = yarisPuanlari[0];
        for (int i = 0; i < yarisPuanlari.length; i++) {
            if (yarisPuanlari[i] > maxPuan) {
                rekor++;
                maxPuan = yarisPuanlari[i];
            }
        }

        System.out.println("Kendi rekorunuzu kirma sayiniz: " + rekor);

    }
}
