package tekrarlar;

public class ornek4 {
    String isim="Ali";
    int yas=25;

    public ornek4(String isim){
        isim="Metin";
        System.out.println("isim: "+isim);
    }
    public ornek4(){
        this("Tugce");
        this.yas=30;
        System.out.println("isim: "+isim);
    }
    public ornek4(String isim,int yas){
        this("Neslihan");
        this.yas=45;

    }

    public static void main(String[] args) {
        ornek4 obj1=new ornek4("Eylul");
        ornek4 obj2=new ornek4("Zehra",32);
        ornek4 obj3=new ornek4();
    }
}
