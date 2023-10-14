package tekrarlar;

public class Runner {
    public static void main(String[] args) {
        Giyim kazak=new Giyim();

        System.out.println(kazak.kategori);//Ust giyim
        System.out.println(kazak.cinsiyet);//Kadin
        System.out.println(kazak.marka);//Pull&Bear
        System.out.println(kazak.renk);//Turuncu
        System.out.println(kazak.fiyat);//5000₺
        System.out.println(kazak.kargo);//xyz kargo
        System.out.println(kazak.beden);//S-M
        System.out.println(kazak.yakaTipi);//Bogazli

        Online hirka=new Giyim();

        System.out.println(hirka.kategori);//giyim
        //System.out.println(hirka.cinsiyet);CTE
        System.out.println(hirka.marka);//Belirtilmedi
        System.out.println(hirka.renk);//Belirtilmedi
        System.out.println(hirka.fiyat);//5000₺
        System.out.println(hirka.kargo);//xyz kargo
        //System.out.println(hirka.beden);CTE
        //System.out.println(hirka.yakaTipi);CTE

        Alisveris hirka2=new Giyim();

        System.out.println(hirka2.kategori);//Belirtilmedi
        System.out.println(hirka2.marka);//Belirtilmedi
        System.out.println(hirka2.renk);//Belirtilmedi
        System.out.println(hirka2.fiyat);//Belirtilmedi
        //System.out.println(hirka2.cinsiyet);CTE
        //System.out.println(hirka.kargo);CTE
        //System.out.println(hirka.beden);CTE
        //System.out.println(hirka.yakaTipi);CTE

    }
}
