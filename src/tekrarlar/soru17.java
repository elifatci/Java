package tekrarlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru17 {

    public static void main(String[] args) {
        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Neslihan-Yildiz-10-K-Soz");
        ogrenciList.add("Hakan-Yilmaz-11-L-Soz");
        ogrenciList.add("Secil-Sahin-10-M-MF");
        ogrenciList.add("Yusuf-Han-12-K-MF");
        ogrenciList.add("Yusuf-Tunc-10-L-EA");
        ogrenciList.add("Neslihan-Sahin-12-A-MF");

        metot1(ogrenciList, "neslihan");
        method2(ogrenciList, "k");
    }

    public static void metot1(List<String> ogrenciList, String istenenİsim) {

        String bilgiler;

        for (int i = 0; i < ogrenciList.size(); i++) {
            bilgiler = ogrenciList.get(i);
            String[] arr = bilgiler.split("-");

            if (arr[0].equalsIgnoreCase(istenenİsim)) {
                System.out.println(arr[0] + " " + arr[1]);
            }

        }
    }

    public static void method2(List<String> ogrenciList, String istenenSube) {
        String bilgiler;

        for (int i = 0; i < ogrenciList.size(); i++) {
            bilgiler = ogrenciList.get(i);
            String[] arr = bilgiler.split("-");

            if (arr[3].equalsIgnoreCase(istenenSube)) {
                System.out.println(arr[0] + " " + arr[1]);
            }

        }
    }

}
