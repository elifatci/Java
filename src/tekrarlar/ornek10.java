package tekrarlar;

public class ornek10 {
    public static void main(String[] args) {


        ornek10 obj=new ornek10();
        obj.ornek10(3,"Java","Python","C#","a","1","de","3");

        new ornek10().ornek10(4,"a","b","c","d","e","f","g","h","i","j","k","l","m","n");


    }
    public void ornek10(int a,String... b){
        System.out.println(b[b.length-a]+" ");
    }
}
