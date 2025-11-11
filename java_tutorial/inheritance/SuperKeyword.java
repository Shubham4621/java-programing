// Super Keyword: Access parent class members
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    
    Student(String name, int age, int rollNo) {
        super(name, age); // Call parent constructor
        this.rollNo = rollNo;
    }
    
    @Override
    void display() {
        super.display(); // Call parent method
        System.out.println("Roll No: " + rollNo);
    }
    
    void showParentInfo() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Parent age: " + super.age);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 20, 101);
        student.display();
        student.showParentInfo();
    }
}