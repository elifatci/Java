package T_Polymorphism;

import T_inheritance.C;

public class
Runner {
    public static void main(String[] args) {
        Grandparent obj1=new Grandparent();
        Parent obj2=new Parent();
        Child obj3=new Child();
        Grandparent obj4=new Child();
        obj1.urun(2);//Grandparent 2,4
        obj2.urun(4);//Parent 4,16
        obj3.urun(7);//Child 7,14
        obj4.urun(10);//Child 10,20


    }
}
