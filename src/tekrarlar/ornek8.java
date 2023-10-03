package tekrarlar;

public class ornek8 {
    static int sayi = 46;
    static String okul = "IU";
    int yas = 31;

    public ornek8(int a, int b, String c) {
        this.sayi = a;
        this.yas = b;
        this.okul = c;
    }

    public static void method1(ornek8 ornk) {
        System.out.println("sayi: " + ornk.sayi + " yas: " + ornk.yas + " okul: " + ornk.okul);
    }


    public static void main(String[] args) {
        ornek8 obj1 = new ornek8(20, 26, "AU");
        ornek8 obj2 = new ornek8(70, 82, "MU");
        method1(obj1);
        method1(obj2);
    }
}
