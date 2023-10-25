package tekrarlar;

public class soru6 {
    public static void main(String[] args) {

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
