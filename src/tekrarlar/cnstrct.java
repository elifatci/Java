package tekrarlar;

public class cnstrct {

    String cinsiyet = "Cinsiyet belirtilmemistir";
    String kategori = "Kategori belirtilmemistir";
    String marka = "Marka belirtilmemistir";
    String beden = "Beden belirtilmemistir";
    String renk = "Renk belirtilmemistir";
    int fiyat = 0;


    cnstrct() {

    }

    @Override
    public String toString() {
        return "Ozellikler=> " +
                "cinsiyet:'" + cinsiyet + '\'' +
                ", kategori:'" + kategori + '\'' +
                ", marka:'" + marka + '\'' +
                ", beden:'" + beden + '\'' +
                ", renk:'" + renk + '\'' +
                ", fiyat:'" + fiyat + '\'';
    }

    cnstrct(String cnsyt, String ktgr) {
        cinsiyet = cnsyt;
        kategori = ktgr;

    }
    cnstrct(String cnsyt,String ktgr,String mrk,String bdn){
        cinsiyet=cnsyt;
        kategori=ktgr;
        marka=mrk;
        beden=bdn;

    }
    cnstrct(String cnsyt,String ktgr,String mrk,String bdn,String rnk,int fyt){
        cinsiyet=cnsyt;
        kategori=ktgr;
        marka=mrk;
        beden=bdn;
        renk=rnk;
        fiyat=fyt;
    }
}
