class Student{
    int id;
    string name;
    int marks;

    void display(int id,string name,int marks){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}

public class program{
    public static void main(string args[]){
        Student s1 = new student();
        s1.name = "shubham";
        s1.id = 46;
        s1.marks = 94;
    }
}