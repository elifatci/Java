package tekrarlar;

public class passByValue {

    public static void main(String[] args) {
        double fiyat = 150;

        System.out.println("%30 indirimli fiyat: " + indirimli30(fiyat));
        System.out.println("%35 indirimli fiyat: " + indirimli35(fiyat));
        System.out.println("%40 indirimli fiyat: " + indirimli40(fiyat));

        System.out.println(fiyat);
    }

    public static double indirimli30(double fiyat) {
        fiyat = fiyat * 70 / 100;
        return fiyat;
    }

    public static double indirimli35(double fiyat) {
        fiyat = fiyat * 65 / 100;
        return fiyat;
    }

    public static double indirimli40(double fiyat) {
        fiyat = fiyat * 60 / 100;
        return fiyat;
    }
}
