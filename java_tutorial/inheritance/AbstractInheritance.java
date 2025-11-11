// Abstract Class Inheritance: Partial implementation
abstract class Appliance {
    String brand;
    
    Appliance(String brand) {
        this.brand = brand;
    }
    
    void turnOn() {
        System.out.println(brand + " appliance turned on");
    }
    
    abstract void operate(); // Must be implemented by child
}

class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }
    
    @Override
    void operate() {
        System.out.println(brand + " washing machine is washing clothes");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }
    
    @Override
    void operate() {
        System.out.println(brand + " refrigerator is cooling food");
    }
}

public class AbstractInheritance {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG");
        Refrigerator fridge = new Refrigerator("Samsung");
        
        wm.turnOn();
        wm.operate();
        
        fridge.turnOn();
        fridge.operate();
    }
}