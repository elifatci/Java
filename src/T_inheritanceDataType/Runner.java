package T_inheritanceDataType;

public class Runner {
    public static void main(String[] args) {

        Giyim obj1 = new Giyim();

        obj1.kategori();//ust giyim
        obj1.marka();//Pull&bear
        obj1.renk();//turuncu
        obj1.fiyat();//5000₺
        obj1.kargo();//xyz
        obj1.cinsiyet();//kadin
        obj1.beden();//S-M
        obj1.yakaTipi();//bogazli

        Online obj2 = new Giyim();

        obj2.kategori();//ust giyim
        obj2.marka();//Pull&bear
        obj2.renk();//turuncu
        obj2.fiyat();//5000₺
        obj2.kargo();//xyz
        //obj2.cinsiyet();//kadin
        //obj2.beden();//S-M
        //obj2.yakaTipi();//bogazli

        Alisveris obj3 = new Giyim();
        obj3.kategori();//ust giyim
        obj3.marka();//Pull&bear
        obj3.renk();//turuncu
        obj3.fiyat();//5000₺
        //obj3.kargo();//xyz
        //obj3.cinsiyet();//kadin
        //obj3.beden();//S-M
        //obj3.yakaTipi();//bogazli


    }
}
