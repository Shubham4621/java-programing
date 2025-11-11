// Interface Inheritance: Multiple inheritance through interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird {
    String name;
    
    Bird(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Duck extends Bird implements Flyable, Swimmable {
    Duck(String name) {
        super(name);
    }
    
    public void fly() {
        System.out.println(name + " is flying");
    }
    
    public void swim() {
        System.out.println(name + " is swimming");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        duck.eat();  // From Bird
        duck.fly();  // From Flyable
        duck.swim(); // From Swimmable
    }
}