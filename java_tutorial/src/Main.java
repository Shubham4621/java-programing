
import java.util.io;
class Student{
    int id;
    String name;
    int marks;

    void display(int id,string name,int marks){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}

public class Main{
    public static void main(string[] args){
        Student s1 = new student();
        s1.display("shubham",46,94);
    }
}