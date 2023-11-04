package tekrarlar;

import java.util.Scanner;

public class soru22 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Toplam oynanan tur sayisi kactir?");
        int toplamTur= scan.nextInt();
        System.out.println("Sonucunu hatirladiginiz kac tur vardir?");
        int eksikTur= scan.nextInt();


        int countH=0;
        int countS=0;
        String[] kazanan=new String[eksikTur];
        for (int i = 0; i < kazanan.length; i++) {
            System.out.println(i+1+". turu kazanan Hami icin H Sami icin S' ye basiniz");
            kazanan[i]=scan.next().toUpperCase().substring(0,1);

            if (kazanan[i].equalsIgnoreCase("H")){
                countH++;

            } else {
                countS++;
            }
        }
        if (countH>countS) {
            System.out.println("Harun");
        }else {
            System.out.println("Cilek");
        }
    }
}
