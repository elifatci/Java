package tekrarlar;

import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        //Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Ibrahim","Burak","Enes","Fatih","Ozan","Mehmet","Sevket"};

        List<String> resultList=new java.util.ArrayList<>();

        for (String each:arr) {
            int uzunluk=each.length();
            String sonuc="";
            if (uzunluk%2==0){
                sonuc=each.substring(0,uzunluk/2);


            }else{
                sonuc=each.substring(uzunluk/2);
            }

            resultList.add(sonuc);



        }

        for (String sonuc:resultList) {
            System.out.print(sonuc+" ");
        }
    }
}
