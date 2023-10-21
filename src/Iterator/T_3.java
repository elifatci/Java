package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class T_3 {
    public static void main(String[] args) {
        //Lİstedeki ilk 5 elemani 5 artirin

        int[] arr={13,15,17,19,27,2,16,56,23,45,14,40};

        List<Integer> sayilar=new ArrayList<>();
        for (int each:arr) {
            sayilar.add(each);

        }
        int index=0;

        ListIterator lit= sayilar.listIterator();
        while (lit.hasNext()&&index<5){
            int sayi=(Integer)lit.next();
            lit.set(sayi+5);
            index++;

        }
        for (int each:sayilar) {
            System.out.println(each);
        }


    }
}
