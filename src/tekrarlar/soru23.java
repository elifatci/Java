package tekrarlar;

import java.util.Scanner;

public class soru23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Toplam kac tane dambil vardir? Kaç tane kaldirmak istiyorsunuz?");
        int N = scan.nextInt();
        int Q = scan.nextInt();

        int[] dumbbellWeights = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print(i + 1 + ". dambilin agirligi: " + " ");
            dumbbellWeights[i] = scan.nextInt();
        }
        System.out.print("Kactan kaca kaldirmak istiyorsunuz?");
        for (int i = 0; i < Q; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();

            int totalWeight = 0;
            for (int j = L - 1; j < R; j++) {
                totalWeight += dumbbellWeights[j];
            }
            System.out.println(totalWeight);


        }
    }
}
