package T_abstractClass;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}


