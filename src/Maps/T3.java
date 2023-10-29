package Maps;

import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciler=T1.okul();

        T1.numaradanOgrenciAdiUpdate(ogrenciler,101,"Simsek");

        T1.numaradanOgrenciAdiUpdate(ogrenciler,104,"Uslu");
    }

}
