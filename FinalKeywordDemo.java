// Final class - cannot be inherited
final class Vehicle {
    // Final variable - cannot be changed once initialized
    final int speedLimit = 80;

    // Final method - cannot be overridden by subclasses
    final void displaySpeed() {
        System.out.println("Speed limit is: " + speedLimit + " km/hr");
    }
}

// Attempting to inherit Vehicle class will cause an error
// class Car extends Vehicle{} // Error: cannot subclass final class Vehicle

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displaySpeed();

        // Uncommenting the line below will cause compile-time error
        // v.speedLimit = 100; // Error: cannot assign a value to final variable
    }
}
