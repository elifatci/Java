package tekrarlar;

import java.util.ArrayList;
import java.util.List;

public class soru11 {

    public static void main(String[] args) {
        String[] isimler = {"Elif", "Nazli", "Kevser", "Abdullah", "Cengiz", "Humeyra"};
        List<String> lst = new ArrayList<>();

        for (String each : isimler) {
            if (each.length() % 2 == 0) {
                lst.add(each.substring(0, each.length() / 2));
            } else {
                lst.add(each.substring(each.length() / 2));
            }
        }
        System.out.println(lst);
    }
}
