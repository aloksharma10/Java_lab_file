// doubt in this question: concept of interface when two interfaces have unique methods and same data members
interface Shape2 {
    double calculateArea();
    void display();
}

interface Color {
    String getColor();
    void display();
}

class Circle2 implements Shape2, Color {
    private double radius;
    private String color;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public void display() {
        System.out.println("Circle: ");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Color: " + getColor());
    }
}

public class Q10 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5.0, "Red");
        circle.display();
    }
}
