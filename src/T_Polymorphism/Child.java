package T_Polymorphism;

public class Child extends Parent{
    int urun(int i){
        int sonuc=i*2;
        System.out.println("Child "+i+","+sonuc);
        return sonuc;
    }
}
