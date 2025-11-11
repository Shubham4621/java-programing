// // Single Inheritance: One child class inherits from one parent class
// class Animal {
//     String name;
    
//     Animal(String name) {
//         this.name = name;
//     }
    
//     void eat() {
//         System.out.println(name + " is eating");
//     }
// }

// class Dog extends Animal {
//     Dog(String name) {
//         super(name);
//     }
    
//     void bark() {
//         System.out.println(name + " is barking");
//     }
// }

// public class SingleInheritance {
//     public static void main(String[] args) {
//         Dog dog = new Dog("Buddy");
//         dog.eat();  // Inherited method
//         dog.bark(); // Own method
//     }
// }

class animal{
    public void walk(){
        System.out.println("All animal can walk");
    }
    static void leg(){
        System.out.println("2leg animal");
    }
}

class dog extends animal{
    static void bark(){
        System.out.println("Dog is barking");
    }
}

class cat extends animal{
    public void mow(){
        System.out.println("cat is mew mew");
    }
}

public class SingleInheritance{
    public static void main(String args[]){
        cat c1 = new cat();
        dog d1 = new dog();
        c1.mow();
        d1.bark();
        c1.walk();
    }
}
