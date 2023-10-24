package tekrarlar;

public class soru6 {
    public static void main(String[] args) {
        /*Soru 1:

Matrisin Transpozunu Yazdir
Bir matrisin transpozu, satırları sütunla değiştirerek bulunabilir; yani orijinal matrisin satırları, yeni matrisin sütunları haline gelecektir.

Beklenilen output

verilen matris
1 2 3
4 5 6
7 8 9
ise

transpozu:
1 4 7
2 5 8
3 6 9

seklinde olmalidir*/

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int satirSayisi = arr.length;
        int sutunSayisi = arr[0].length;

        int[][] yeniArr = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j <sutunSayisi ; j++) {
                System.out.print(arr[i][j]+" ");
                yeniArr[j][i]=arr[i][j];
            }
            System.out.println("");

        }
        System.out.println("=================");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j <satirSayisi ; j++) {
                System.out.print(yeniArr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
