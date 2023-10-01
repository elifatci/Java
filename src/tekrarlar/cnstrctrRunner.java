package tekrarlar;

public class cnstrctrRunner {
    public static void main(String[] args) {

        cnstrct giyim1 = new cnstrct("Kadin", "Kazak");
        System.out.println(giyim1); //Ozellikler=> cinsiyet:'Kadin',
                                    // kategori:'Kazak',
                                    // marka:'Marka belirtilmemistir',
                                    // beden:'Beden belirtilmemistir',
                                    // renk:'Renk belirtilmemistir',
                                    // fiyat:'Fiyat belirtilmemistir'

        cnstrct giyim2 = new cnstrct("Erkek", "Sweatshirt", "Hummel", "L");
        System.out.println(giyim2); //Ozellikler=> cinsiyet:'Erkek',
                                    // kategori:'Sweatshirt',
                                    // marka:'Hummel',
                                    // beden:'L',
                                    // renk:'Renk belirtilmemistir',
                                    // fiyat:'Fiyat belirtilmemistir'


        cnstrct giyim3 = new cnstrct("Kadin", "Jeans", "Colin's", "27/29", "Mavi", 600);
        System.out.println(giyim3); //Ozellikler=> cinsiyet:'Kadin',
                                    // kategori:'Jeans',
                                    // marka:'Colin's',
                                    // beden:'27/29',
                                    // renk:'Mavi',
                                    // fiyat:'600'


    }

}





