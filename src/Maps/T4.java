package Maps;

import java.util.*;

public class T4 {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Sadi-Sumbul-10-H-MF");
        ogrenciMap.put(102, "Halit-Dogan-10-K-TM");
        ogrenciMap.put(103, "Narin-Faaz-11-K-TM");
        ogrenciMap.put(104, "Meral-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevda-Can-10-C-MF");


        Set<Map.Entry<Integer, String>> ogrenciEntry = ogrenciMap.entrySet();
        String[] arr;
        int key;
        String value;
        List<String> list = new ArrayList<>();

        for (Map.Entry<Integer, String> each : ogrenciEntry) {
            key = each.getKey();
            value = each.getValue();
            arr = value.split("-");


            if (arr[2].equalsIgnoreCase("10")) {
                list.add(String.valueOf((Integer) key));
                list.add(arr[0]);
                list.add(arr[1]);
                list.add(arr[4]);
            }

        }
        System.out.println(list);
    }

}
