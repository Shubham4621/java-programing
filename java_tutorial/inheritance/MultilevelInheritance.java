// Multilevel Inheritance: Chain of inheritance
class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void start() {
        System.out.println(brand + " vehicle started");
    }
}

class Car extends Vehicle {
    int doors;
    
    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }
    
    void drive() {
        System.out.println("Driving " + brand + " car with " + doors + " doors");
    }
}

class SportsCar extends Car {
    int maxSpeed;
    
    SportsCar(String brand, int doors, int maxSpeed) {
        super(brand, doors);
        this.maxSpeed = maxSpeed;
    }
    
    void race() {
        System.out.println(brand + " racing at " + maxSpeed + " km/h");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar("Ferrari", 2, 350);
        ferrari.start(); // From Vehicle
        ferrari.drive(); // From Car
        ferrari.race();  // Own method
    }
}