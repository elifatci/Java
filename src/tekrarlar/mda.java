package tekrarlar;

public class mda {
    public static void main(String[] args) {


        //Verilen 2 katli bir array’de bulunan tek sayilari toplayip,
        // sonucu yazdiran bir method olusturun

        int[][] eleman = {{4, 6}, {1, 2, 4, 5}, {7, 8}, {10}, {12, 10, 34}, {21}, {16, 18}};

        ciftSayilariTopla(eleman);


    }

    public static void ciftSayilariTopla(int[][] arr) {

        int toplam = 0;



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j] % 2) != 0) {
                    toplam += arr[i][j];

                }
            }

        }


        System.out.println("tek sayilarin toplami: " + toplam);
    }
}
