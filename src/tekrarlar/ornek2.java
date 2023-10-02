package tekrarlar;

public class ornek2 {
    String isim = "Sezen";
    int yas = 20;

    public ornek2() {
        isim = "Munise";
        yas = 33;
    }

    public ornek2(String isim, int yas) {
        this.isim = isim;
        this.yas = 40;
    }

    public static void main(String[] args) {
        ornek2 obj1 = new ornek2();
        ornek2 obj2 = new ornek2("Murat", 33);
        System.out.println("isim :" + obj1.isim + "\nyas :" + obj2.yas);
    }

}
