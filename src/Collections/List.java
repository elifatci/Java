package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    // Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi
    //birakmak icin 0’a basmalidir.
    //Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
    //liste1 : …….
    //liste2 : …….
    //ortak elementler :


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        java.util.List<String> lst1 = new ArrayList<>();
        java.util.List<String> lst2 = new ArrayList<>();
        System.out.println("Lutfen liste1'e eklenmek uzere degerler giriniz Deger girmeniz bitince 0'a basiniz");
        while (true) {
            String liste1 = scanner.nextLine();
            if (liste1.equals("0")) {
                break;
            }
            lst1.add(liste1);
        }
        System.out.println("Lutfen liste2'e eklenmek uzere degerler giriniz Deger girmeniz bitince 0'a basiniz");
        while (true) {
            String liste2 = scanner.nextLine();
            if (liste2.equals("0")) {
                break;
            }
            lst2.add(liste2);
        }

            System.out.println("Liste1: " + lst1);


            System.out.println("Liste2: " + lst2);

            lst1.retainAll(lst2);

            System.out.println("Ortak elemanlar: " + lst1);
        }
    }

