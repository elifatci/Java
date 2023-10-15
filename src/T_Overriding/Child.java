package T_Overriding;

public class Child extends Parent {
    public void method(){
        System.out.println("Child method");
        super.method();
    }

    public static void main(String[] args) {
        Parent obj1=new Child();
        obj1.method();
        //Child method
        //Parent method

    }

}
