package tekrarlar;

import java.util.Arrays;

public class soru16 {
    static String bilgi = "Murat-Yilmaz-12-C-EA";

    public static String[] isimSoyisim(String bilgi) {
        String[] arr = bilgi.split("-");

        String[] arr1 = new String[2];
        arr1[0] = arr[0];
        arr1[1] = arr[1];

        return arr1;
    }

    public static String[] sube(String bilgi) {

        String[] arr = bilgi.split("-");

        String[] arr1 = new String[1];
        arr1[0] = arr[3];

        return arr1;


    }

    public static void main(String[] args) {

        System.out.println("Ogrenci ad soyad: " + Arrays.toString(isimSoyisim(bilgi)));

        System.out.println("Ogrenci sube: " + Arrays.toString(sube(bilgi)));

    }
}
