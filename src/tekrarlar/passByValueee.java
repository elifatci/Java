package tekrarlar;

import java.util.Arrays;

public class passByValueee {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6};
        System.out.println(Arrays.toString(degerAta(arr)));
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(elementdegistir(arr)));
        System.out.println(Arrays.toString(arr));

    }

    public static int[] degerAta(int[] arr) {
        int[] yeniArr = {2, 4, 7};
        arr = yeniArr;
        return arr;

    }

    public static int[] elementdegistir(int[] arr) {
        arr[1] = 5;
        arr[2] = 10;
        return arr;

    }
}
