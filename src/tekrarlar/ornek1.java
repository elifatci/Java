package tekrarlar;

public class ornek1 {

    String isim = "Ayse Serap";
    int yas = 40;
    double kilo = 70;

    ornek1(String isim, int yas, double kilo) {
        this.isim=isim;
        this.yas=yas;
        this.kilo=50;

    }

    public static void main(String[] args) {

        ornek1 obj=new ornek1("Burcu",43,60);
        System.out.println("isim: "+obj.isim+ " yas: "+obj.yas +" kilo :"+ obj.kilo);

    }
}
