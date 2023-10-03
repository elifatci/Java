package tekrarlar;

public class ornek5 {
    String isim = "Nazli";
    int yas = 20;

    public ornek5() {
        String isim = "Kevser";
        System.out.println("isim: " + isim);
    }

    public ornek5(String isim) {
        this.yas = 15;
        System.out.println("isim: " + isim);
    }

    public ornek5(String isim, int yas) {
        this("Nisa");
        this.yas = 37;

    }

    public void ornek5() {
        System.out.println(isim);
    }

    @Override
    public String toString() {
        return "ozellikler:" +
                "isim='" + isim + '\'' +
                ", yas=" + yas;
    }

    public static void main(String[] args) {
        ornek5 obj1 = new ornek5("Esma");
        System.out.println(obj1);
        ornek5 obj2 = new ornek5("Emine", 35);
        System.out.println(obj2);
    }
}
