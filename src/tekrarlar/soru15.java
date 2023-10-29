package tekrarlar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class soru15 {
    public static void main(String[] args) {

        Set<Integer> hash=new HashSet<>();

        Set<Integer> tree=new TreeSet<>();

        Random random=new Random();
        int temp;

        long bslngc=LocalTime.now().toNanoOfDay();

        for (int i = 0; i < 50000; i++) {
            temp=random.nextInt(10000);
            hash.add(temp);
        }
        long bts=LocalTime.now().toNanoOfDay();
        System.out.println(bts-bslngc);


        long bslngc1= LocalTime.now().toNanoOfDay();

        for (int i = 0; i < 50000; i++) {
            temp=random.nextInt(10000);
            tree.add(temp);
        }
        long bts1=LocalTime.now().toNanoOfDay();
        System.out.println(bts1-bslngc1);

    }
}
