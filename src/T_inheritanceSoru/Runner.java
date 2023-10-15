package T_inheritanceSoru;

public class Runner extends Deneme{
    @Override
    public int getInt() {
        return 25;
    }

    public static void main(String[] args) {
        Deneme obj1=new Runner();
        Runner obj2=new Runner();
        System.out.println(obj1.getInt());//25
        System.out.println(obj2.getInt());//25
    }
}
