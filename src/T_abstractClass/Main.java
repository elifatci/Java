package T_abstractClass;

public class Main {

        public static void main(String[] args) {
            Circle circle = new Circle("Yellow", 5.0);
            Rectangle rectangle = new Rectangle("Green", 4.0, 3.0);

            circle.displayColor();
            System.out.println("Circle Area: " + circle.calculateArea());

            rectangle.displayColor();
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
        }
}
