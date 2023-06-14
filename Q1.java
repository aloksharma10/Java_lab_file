import java.util.Scanner;
class Rectangle {
    int length;
    int breadth;
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextInt();
    }
    void output() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
    int calcArea() {
        return length * breadth;
    }
}

class Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.output();
        double area = rectangle.calcArea();
        System.out.println("Area: " + area);
    }
}