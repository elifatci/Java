package tekrarlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru8 {
    public static List<String> isimGirme() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isimleri giriniz. İsleminiz bittiginde Q'ya basiniz");

        List<String> lst = new ArrayList<>();
        while (true) {
            String girilenİsimler = scanner.nextLine();
            if (girilenİsimler.equalsIgnoreCase("Q")) {
                break;
            }
            lst.add(girilenİsimler);
        }
        return lst;
    }

    public static void main(String[] args) {

        List<String> lst2 = new ArrayList<>();

        lst2=isimGirme();
        System.out.println(lst2);



    }
}
