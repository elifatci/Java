package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T5 {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Sadi-Sumbul-10-H-MF");
        ogrenciMap.put(102, "Halit-Dogan-10-K-TM");
        ogrenciMap.put(103, "Narin-Faaz-11-K-TM");
        ogrenciMap.put(104, "Meral-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevda-Can-10-C-MF");

        Set<Map.Entry<Integer, String>> ogrenciSet = ogrenciMap.entrySet();


        String value;
        String[] arr;

        for (Map.Entry<Integer, String> each : ogrenciSet) {

            value = each.getValue();
            arr = value.split("-");

            arr[1] = arr[1].toUpperCase();

            value = arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3] + "-" + arr[4];


            each.setValue(value);
        }
        System.out.println(ogrenciSet);

    }
}
