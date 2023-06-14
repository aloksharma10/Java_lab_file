public class Q2 {
    public static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double sideLength = 4.5;
        double length = 5.2;
        double width = 3.7;
        double base = 6.0;
        double height = 2.8;

        // Calculate the area of a square
        double squareArea = calculateArea(sideLength);
        System.out.println("Area of square: " + squareArea);

        // Calculate the area of a rectangle
        double rectangleArea = calculateArea(length, width);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate the area of a triangle
        double triangleArea = calculateArea(base, height);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
