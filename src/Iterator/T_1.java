package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T_1 {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        Iterator iterator = sayilar.iterator();


        while (iterator.hasNext()) {
            int sayi = (Integer) iterator.next();
            if (!(sayi > 20 && sayi < 40)) {
                iterator.remove();
            }
        }
        System.out.println(sayilar);


    }
}
