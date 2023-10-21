package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class T_2 {
    public static void main(String[] args) {

        int[] arr={12,14,1,6,23,45,7,3,6,9,36,27,34};

        List<Integer> sayilar=new ArrayList<>();
        for (int each:arr) {
            sayilar.add(each);
        }
        System.out.println(sayilar);

       ListIterator iterator= sayilar.listIterator();

       while (iterator.hasNext()){
           iterator.next();
       }

       while (iterator.hasPrevious()){
           System.out.println(iterator.previous()+" ");
       }


    }
}
