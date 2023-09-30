package tekrarlar;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //10 elemanlı bir tamsayı dizisine 1 ile 100 arasında
        //rastgele sayılar yerleştirildikten sonra bu sayılardan en büyüğünü bulup yazdıran kodu yazınız

        int[] arr = {2, 56, 23, 12, 6, 9, 10, 45, 99, 7};

        buyukSayiBul(arr);
    }
    public static void buyukSayiBul(int[] arr){
        int buyukSayi = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            buyukSayi=arr[arr.length-1];

        }
        System.out.println(buyukSayi);
    }
}
