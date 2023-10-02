package tekrarlar;

public class ornek3 {
    String isim="Merve";
    int yas=40;

    public ornek3(){
        isim="İrem";
    }
    public ornek3(String isim, int yas){
        this();
        this.yas=yas;
    }

    public static void main(String[] args) {
        ornek3 obj1=new ornek3();
        ornek3 obj2=new ornek3("Ebru",23);
        System.out.println("isim: "+obj1.isim+"\nyas: "+obj2.yas);
    }
}
