package tekrarlar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class soru14 {
    public static void main(String[] args) {
        // Verilen bir array’deki tekrar eden elementleri silerek, her element’den
        //sadece bir tane olacak sekilde yeni bir array olusturun.

        int[] arr={2,3,4,2,6,4,5,3,2,4,6,5,7,9};

        Set<Integer> set=new TreeSet<>();

        for (Integer each:arr) {
            set.add(each);
        }
        System.out.println(set);

        int[] yeniArr=new int[set.size()];

        int index=0;
        for (Integer each:set) {
            yeniArr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(yeniArr));

    }
}
