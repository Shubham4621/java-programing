interface Shape {
    void draw();
    void area();
}

interface Colorable {
    void setColor(String c);
}

class Circle implements Shape, Colorable {
    double radius;
    String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Shape is drawing.....");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color is: " + color);
    }

    public void area() {
        System.out.println("Area of the Circle is: " + (3.14 * radius * radius));
    }
}

public class ShapeInterfacedemo {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        c.draw();
        c.area();
        c.setColor("Red");
    }
}
