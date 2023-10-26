package tekrarlar;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class soru10 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2, 6, 8, 2, 1};

        Set<Integer> sayilar = new TreeSet<>();

        for (Integer each : arr) {
            sayilar.add(each);
        }
        System.out.println(sayilar);//[1, 2, 4, 5, 6, 7, 8, 9]

        arr = new int[sayilar.size()];
        int index = 0;

        for (Integer each : sayilar) {
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr));//[1, 2, 4, 5, 6, 7, 8, 9]
    }
}
