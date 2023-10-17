package T_abstractQuestion;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(0, 0, 5.0);
        Shape rectangle = new Rectangle(0, 0, 4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());

    }


}
