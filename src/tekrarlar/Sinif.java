package tekrarlar;

public class Sinif extends Okul {
    int sayi1 = 30;
    int sayi3 = 34;
    String isim2 = "Ayse";
    String isim3 = "Derya";

    Sinif() {
        System.out.println("Sinif const");

        System.out.println(this.sayi1);
        System.out.println(super.sayi1);
        System.out.println(this.sayi2);
        System.out.println(super.sayi2);
        System.out.println(this.sayi3);

        super.isim1 = "Hatice";
        System.out.println(this.isim1);
        System.out.println(super.isim1);
        this.isim2 = "Kenan";
        System.out.println(this.isim2);
        System.out.println(super.isim2);
        System.out.println(this.isim3);

    }

    public static void main(String[] args) {

        Sinif obj = new Sinif();
    }
}
