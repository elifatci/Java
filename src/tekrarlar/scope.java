package tekrarlar;

public class scope {

         /*


    =====LOCAL VARİABLE=====                                                        =====CLASS LEVEL VARİABLE=====

    1-)Bir method yada kod blogu icerisinde olusturulur                              1-)Method ve kod bloklarinin disinda olusturulurlar.


   2-) Scope'lari, icinde olusturulduklari kod bloklaridir. Bu blok disinda          2-)Scope’lari tum class’tir. Ancak  static keyword kullanilip
      kullanilamazlar.Kullanirsak CTE olusur.                                       kullanilmamalarina gore kullanimlari farkli olur.
                                                                                    a)static
                                                                                    b)instance(static olmayan variable)

  3-)  Local variable’lar deklare edilirken deger atama mecburiyetleri yoktur.      3-)

                                                                                      a-)Static Variable:
    Yalniz deger atamadan kullanmak isterseniz CTE hatasi verir.                     --Class icinde tum objelerin ortak kullanimi icin tek bir
                                                                                     variable olusturulur. Butun objeler kullanır.
  4-)Loop variable'larda bir local variable'dir. Loop icinde olusturulan             --Static variable'lar static methodlardan ve static olmayan methodlardan
  variable'lar sadece o loop icinde gecerlidir. Loop'un scope'u kapandiktan sonra    kullanilabilir
  Java Garbage Collector ozelligi devreye girip variable'i cöpe atar.                --Deger atama mecburiyetimiz yoktur. Deger atamadan kullanmak istersek
                                                                                     Java default degerleri kullanır.
                                                                                     Default degerler:
                                                                                     Sayisal degerler==>0
                                                                                     String==>null
                                                                                     char==>hiclik
                                                                                      boolean==>false

                                                                                     3-) b-)İnstance Variable:
                                                                                     --Static variable'larda oldugu gibi deger atama mecburiyeti yoktur
                                                                                     Deger atamadan kullanmak istersek Java default degerleri kullanır.
                                                                                     --Static olmadiklari icin static methodlardan direk kullanilmazlar.
                                                                                     --Static methodlardan intance variable'lara ulasmak istersek
                                                                                     obje olusturmamiz gerekir:
                                                                                     classİsmi objeİsmi =new Classİsmi(); seklinde obje olusturmaliyiz



     */

}




