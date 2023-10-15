package T_inheritanceDataTypePolymorphism;

public class Runner {
    public static void main(String[] args) {
        Deneme obj1 = new Deneme();
        Child obj2 = new Child();
        obj2.method2();//Method2,Child
        obj1.method1();//Method1,Deneme
        obj2.method1();//Method1,Child
        obj1 = obj2;//Deneme obj1=new Child();
        obj1.method1();//Method1,Child
    }
}
