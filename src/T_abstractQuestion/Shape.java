package T_abstractQuestion;

abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x,y");
    }

    abstract double area();
}
