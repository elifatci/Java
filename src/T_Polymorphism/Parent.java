package T_Polymorphism;

public class Parent extends Grandparent{
    int urun(int i){
        int sonuc=i*i;
        System.out.println("Parent "+i+","+sonuc);
        return sonuc;
    }
}
