package tekrarlar;

import java.util.ArrayList;
import java.util.List;

public class passByValuee {

    // Main method’da bir list olusturup elemanlar atayalim.
    //2 method olusturup once listeyi, sonra
    //listedeki elemanlari degistirelim.
    //- ilk method’da bizim listemiz disinda
    //bir liste olusturup deger atayalim,
    //sonra yeni listeyi bizim asil listemize
    //atayalim ve asil listemizi main
    //method’a dondurelim.
    //- ikinci method’da bizim listemizin
    //elementlerini degistirip, asil
    //listemizi main method’a
    //dondurelim.

    public static void main(String[] args) {

        List<Integer> elemanlar = new ArrayList<>();
        elemanlar.add(1);
        elemanlar.add(4);
        elemanlar.add(7);
        elemanlar.add(9);

        System.out.println(listeDegerAta(elemanlar));
        System.out.println(elemanlar);


        System.out.println(elementleriDegis(elemanlar));
        System.out.println(elemanlar);


    }

    public static List<Integer> listeDegerAta(List<Integer> elemanlar) {

        List<Integer> yeniList = new ArrayList<>();
        yeniList.add(11);
        yeniList.add(20);
        elemanlar = yeniList;
        return elemanlar;

    }

    public static List<Integer> elementleriDegis(List<Integer> elemanlar) {
        elemanlar.set(0, 27);
        elemanlar.set(1, 6);
        return elemanlar;


    }
}
