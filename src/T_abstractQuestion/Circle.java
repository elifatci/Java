package T_abstractQuestion;

public class Circle extends Shape {
    double radius;

    Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
        System.out.println(radius);
    }


    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
