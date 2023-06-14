class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void displayCar() {
        System.out.println("This is a car.");
    }
}


class Sedan extends Car {
    void displaySedan() {
        System.out.println("This is a sedan car");
    }
}

class Motorcycle extends Vehicle {
    void displayMotorcycle() {
        System.out.println("This is a motorcycle.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Multilevel inheritance
        Sedan sedan = new Sedan();
        sedan.display();       
        sedan.displayCar();    
        sedan.displaySedan();  
        System.out.println();
        // Hierarchical inheritance
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.display();           
        motorcycle.displayMotorcycle(); 
    }
}
