package Maps;

import java.util.*;

public class T1 {

    public static Map<Integer, String> okul() {

        Map<Integer, String> ogrenciList = new HashMap<>();

        ogrenciList.put(101, "Cemil-Guz-11-H-MF");
        ogrenciList.put(102, "Bunyamin-Dogan-10-K-TM");
        ogrenciList.put(103, "Kaan-Faaz-11-K-TM");
        ogrenciList.put(104, "Ayse-Can-10-H-MF");
        ogrenciList.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciList.put(106, "Sevgi-Can-10-C-MF");
        ogrenciList.put(107, "Zehra-Kamil-10-H-TM");
        ogrenciList.put(108, "Berat-Arslan-12-C-Soz");

        return ogrenciList;
    }

    public static void subedenOgrenciBulma(Map<Integer, String> ogrenciList, String verilenSube) {

        Collection<String> ogrenciCollection = ogrenciList.values();

        String[] arr;
        for (String each : ogrenciCollection) {

            arr = each.split("-");

            if (arr[3].equalsIgnoreCase(verilenSube)) {
                System.out.println(verilenSube + " subesindeki ogrenci Ad Soyad: " + arr[0] + " " + arr[1]);
            }
        }

    }

    public static void numaradanOgrenciAdiUpdate(Map<Integer, String> ogrenciList, Integer ogrenciNo, String yeniSoyad) {

        Set<Integer> setNo = ogrenciList.keySet();

        String eskiBilgi = ogrenciList.get(ogrenciNo);
        String[] arr = eskiBilgi.split("-");
        arr[1] = yeniSoyad;

        String yeniBilgi= arr[0]+"-"+arr[1]+"-"+arr[2]+"-"+arr[3]+"-"+arr[4];

        ogrenciList.put(ogrenciNo,yeniBilgi);
        System.out.println(ogrenciList);
    }
}



