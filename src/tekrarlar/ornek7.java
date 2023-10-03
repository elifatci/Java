package tekrarlar;

public class ornek7 {
    static int sayi = 49;
    int yas = 56;

    public ornek7() {
        sayi++;
        yas = 11;
    }

    public static int method1() {
        return 2 * sayi;
    }

    public static void main(String[] args) {
        ornek7 obj1 = new ornek7();
        ornek7 obj2 = new ornek7();
        int sonuc = obj2.method1();
        System.out.println("yas:" + obj2.yas + ", " + "\nsayi:" + sayi + ", " + "\nsonuc:" + sonuc);
    }
}
