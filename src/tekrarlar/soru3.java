package tekrarlar;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //1x1=1  1x2=2  1x3=3  1x4=4  1x5=5
        //2x1=2  2x2=4  2x3=6  2x4=8  2x5=10
        //3x1=3  3x2=6  3x3=9  3x4=12  3x5=15
        //4x1=4  4x2=8  4x3=12  4x4=16  4x5=20
        //5x1=5  5x2=10  5x3=15  5x4=20  5x5=25  konsolda bu şekilde olacak sekilde carpim tablosu yapın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen carpim tablosunun kac satir ve sutundan olusacagini giriniz: ");
        int satir= scanner.nextInt();
        int sutun= scanner.nextInt();

        int arr[][]=new int[satir][sutun];

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");

            }
            System.out.println("");

        }
    }
}
