package tekrarlar;

import java.util.Random;
import java.util.Scanner;

public class soru24 {
   static Scanner scanner=new Scanner(System.in);
   static int tahminSayi;

    public static void main(String[] args) {
          /*Küçük bir piyango oyunu tasarlayınız. Sistem iki basamaklı bir sayı üretmeli.
          Kullanıcıdan da bu sayıyı tahmin etmesini istemelisiniz.
          Eğer kullanıcı sayıyı tam olarak doğru bilirse 10000 TL;
          Eğer kullanıcı sayının basamaklarını bilirse yani 58 yerine 85 yazmıssa 5000TL
          Eğer kullanıcı şanslı numaranın sadece bir basamağını bilirse 1000 TL kazanır.
          */

        System.out.println("Lutfen iki basamakli pozitif bir sayi giriniz");
        tahminSayi= scanner.nextInt();

        System.out.println(sansliSayi());

    }
    public static int sansliSayi(){

        Random random=new Random();
        int randomIntInRange = random.nextInt(90) + 10;

       int randomBirlerBasamagi= randomIntInRange%10;
       int randomOnlarBasamagi=randomIntInRange/10;

       int tahminBirlerBasamagi=tahminSayi%10;
       int tahminOnlarBasamagi=tahminSayi/10;
        if (tahminSayi==randomIntInRange){
            System.out.println("Tebrikler 10000₺ kazandiniz");
        } else if (tahminBirlerBasamagi==randomOnlarBasamagi &&tahminOnlarBasamagi==randomBirlerBasamagi) {
            System.out.println("Tebrikler 5000₺ kazandiniz");
        } else if (tahminBirlerBasamagi==randomBirlerBasamagi || tahminBirlerBasamagi==randomOnlarBasamagi
                || tahminOnlarBasamagi==randomBirlerBasamagi || tahminOnlarBasamagi==randomOnlarBasamagi) {
                System.out.println("Tebrikler 1000₺ kazandiniz");

        }else {
            System.out.println("Lutfen tekrar deneyiniz");
        }

        return randomIntInRange;
    }
}
