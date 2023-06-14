abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public final void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape {
    private double length;
    private double width;

    public Rectangle1(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width ;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.display();

        System.out.println();

        Rectangle1 rectangle = new Rectangle1("Blue", 4.0, 6.0);
        rectangle.display();
    }
}
