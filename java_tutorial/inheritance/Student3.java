// import java.util.Scanner;
// class comp{
//     String student1;
//     String student2;

//     public void display(){
//         System.out.println(student1+" "+student2);
//     }
// }

// public class Student3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         comp s1 = new comp();
//         System.out.println("Enter the name of student 1:");
//         s1.student1 = sc.nextLine();
//         System.out.println("Enter the name of student 2:");
//         s1.student2 = sc.nextLine();
//         s1.display();



//     }
// }


class operation{
    int no1;
    int no2;

    operation(int a,int b){
        a = no1;
        b = no2;
    }
}

class operator extends operation{
    public void calculations(){
        System.out.println("sum is:"+(no1+no2));
        System.out.println("diff is:"+(no1-no2));
        System.out.println("product is:"+(no1*no2));
        System.out.println("division is:"+(no1/no2));

    }
}

public class Student3{
    public static void main(String args[]){
        operation a1 = new operation(25,25);
        operator s1 = new operator();
        s1.calculations();
    }
}