//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num1 = sc.nextInt();
//        System.out.println("Enter a number:");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("sum is : "+sum);
//        sc.close();
//
//    }
//}
import java.util.io*;
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
        s1.name = "shubham";
        s1.id = 46;
        s1.marks = 94;

        s1.display();
    }
}