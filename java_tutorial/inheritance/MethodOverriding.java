// Method Overriding: Child class provides specific implementation
class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void work() {
        System.out.println(name + " is working");
    }
    
    double calculateBonus() {
        return salary * 0.1;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    void work() {
        System.out.println(name + " is managing team");
    }
    
    @Override
    double calculateBonus() {
        return salary * 0.2; // Managers get higher bonus
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    void work() {
        System.out.println(name + " is coding");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        Manager mgr = new Manager("Alice", 80000);
        Developer dev = new Developer("Bob", 70000);
        
        emp.work();
        mgr.work();
        dev.work();
        
        System.out.println("Employee bonus: " + emp.calculateBonus());
        System.out.println("Manager bonus: " + mgr.calculateBonus());
        System.out.println("Developer bonus: " + dev.calculateBonus());
    }
}