package tekrarlar;

public class ornek6 {
    static int sayi = 18;
    int yas = 38;

    public ornek6() {
        sayi++;
        yas++;
    }

    public static int method1() {
        return sayi;
    }

    public int method2() {
        return yas;
    }

    public static void main(String[] args) {
        ornek6 obj1 = new ornek6();
        ornek6 obj2 = new ornek6();
        ornek6 obj3 = new ornek6();
        System.out.println("Sayi: " + obj3.sayi + " , " + "Yas: " + obj3.yas);
    }
}
