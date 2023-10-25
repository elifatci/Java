package tekrarlar;

public class soru7 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int satirSayisi = arr.length;
        int sutunSayisi = arr[0].length;
        int satirToplami;
        int sutunToplami;


        for (int i = 0; i < satirSayisi; i++) {
            satirToplami = 0;

            for (int j = 0; j < sutunSayisi; j++) {
                satirToplami += arr[i][j];


            }
            System.out.println((i + 1) + ". satirin toplami :" + satirToplami);

        }

        for (int i = 0; i < satirSayisi; i++) {
            sutunToplami = 0;
            for (int j = 0; j < sutunSayisi; j++) {
                sutunToplami += arr[j][i];

            }
            System.out.println((i + 1) + ". sutunun toplami: " + sutunToplami);

        }


    }

}
