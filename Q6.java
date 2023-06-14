class Vehicle1 {
    private String brand;

    public Vehicle1(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called.");
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car1 extends Vehicle1{
    private int year;

    public Car1(String brand, int year) {
        super(brand); 
        this.year = year;
        System.out.println("Car constructor called.");
    }

    public void displayCar() {
        super.display();
        System.out.println("Year: " + year);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Car1 car = new Car1("Toyota", 2022);
        car.displayCar();
    }
}
