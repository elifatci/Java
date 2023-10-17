package T_abstractQuestion;

public class Rectangle extends Shape {
    double width, height;

    Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
        System.out.println("width,height");
    }

    double area() {
        return width * height;
    }
}
