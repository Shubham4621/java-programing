interface Shape { 
void draw(); 
void area(); 
}

interface Colorable { 
void setColor(String color); 
}

class Circle implements Shape, Colorable { 
double radius; 
String color;
Circle(double radius) {
    this.radius = radius;
}

public void draw() {
    System.out.println("Drawing a Circle");
}

public void area() {
    double area = 3.1416 * radius * radius;
    System.out.println("Circle area: " + area);
}

public void setColor(String color) {
    this.color = color;
    System.out.println("Circle color set to " + color);
	}
}

class Rectangle implements Shape, Colorable { 
double length, width; 
String color;
Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}

public void draw() {
    System.out.println("Drawing a Rectangle");
}

public void area() {
    double area = length * width;
    System.out.println("Rectangle area: " + area);
}

public void setColor(String color) {
    this.color = color;
    System.out.println("Rectangle color set to " + color);
	}
}

public class Main_inter 
{
public static void main(String[] args) 
{
 	Circle c = new Circle(5); 
c.draw(); 
c.area();
c.setColor("Red"); 
System.out.println();
   Rectangle r = new Rectangle(4, 6);
    r.draw();
    r.area();
    r.setColor("Blue");
	}
}
