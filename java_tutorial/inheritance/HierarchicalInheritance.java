// Hierarchical Inheritance: Multiple child classes inherit from one parent
class Shape {
    String color;
    
    Shape(String color) {
        this.color = color;
    }
    
    void display() {
        System.out.println("Shape color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    void area() {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rect = new Rectangle("Blue", 4, 6);
        
        circle.display();
        circle.area();
        
        rect.display();
        rect.area();
    }
}