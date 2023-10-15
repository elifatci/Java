package T_inheritance;

public class Runner {
    public static void main(String[] args) {
        A obj1=new A(); obj1.method1();//A
        B obj2=new D(); obj2.method2();//D
        C obj3=new C(); obj3.method3();//C3
        new D().method4();//D4


    }
}
