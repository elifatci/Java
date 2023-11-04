package tekrarlar;

import java.util.Scanner;


public class soru20 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime= scan.next();

        StringBuilder yeniKelime=new StringBuilder();
        yeniKelime.append(girilenKelime.charAt(0));

        for (int i = 1; i <girilenKelime.length(); i++) {

            if (girilenKelime.charAt(i)!=girilenKelime.charAt(i-1)){
                yeniKelime.append(girilenKelime.charAt(i));
            }

        }
        System.out.println(yeniKelime);



    }
}
