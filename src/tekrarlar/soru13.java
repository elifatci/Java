package tekrarlar;

public class soru13 {
    public static void main(String[] args) {
        int a = 0;
        outer:
        while (true)
        {
            a++;
            inner:
            for (int j = 0; j < 7; j++)
            {
                a += j;
                if (j == 4)
                    continue inner;
                break outer;
            }
            continue outer;
        }
        System.out.println(a);
    }
}
