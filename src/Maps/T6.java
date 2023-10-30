package Maps;

import java.util.Map;
import java.util.Set;

public class T6 {
    public static void main(String[] args) {
        Set<Map.Entry<Integer, String>> ogrenciSet = T1.okul().entrySet();

        String value;
        String[] arr;
        for (Map.Entry<Integer, String> each : ogrenciSet) {

            value = each.getValue();
            arr = value.split("-");

            switch (arr[2]) {
                case "9":
                    arr[2] = "10";
                    break;
                case "10":
                    arr[2] = "11";
                    break;
                case "11":
                    arr[2] = "12";
                    break;
                case "12":
                    arr[2] = "Mezun";
                    break;
            }

            value = arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3] + "-" + arr[4];

            each.setValue(value);
        }
        System.out.println(ogrenciSet);

    }
}
