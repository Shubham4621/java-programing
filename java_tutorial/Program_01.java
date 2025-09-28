// public class Program_01 {
//     String name;
//     static void Details(String name) {
//         System.out.println("Welcome " + name);
//     }
    
//     public static void main(String[] args) {
//         Details("Mitali");
//     }
// }

// public class Program_01 {
//     static int Details(int num) {
//         int fact = 1;
//         for (int i=2; i<=num; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(Details(3));
//         System.out.println(Details(4));
//         System.out.println(Details(5));
//     }
// }


class Operator{
    int sum;
    public void add(int a,int b){
    System.out.println(a+b); 
    }
}
    // class _add extends operator{
    //  System.out.println(a+b); 

    // }

public class Program_01{

public static void main(String args[])
{
    Operator p1 = new Operator();
    p1.add(45,45);
}
}

// class Operator {
//     int sum;

//     public void add(int a, int b) {
//         System.out.println("Sum from Operator: " + (a + b));
//     }
// }

// class _add extends Operator {
//     @Override
//     public void add(int a, int b) {
//         System.out.println("Sum from _add: " + (a + b));
//     }
// }

// public class Program_01 {
//     public static void main(String args[]) {
//         Operator p1 = new Operator();
//         p1.add(45, 45);

//         _add p2 = new _add();
//         p2.add(30, 20);
//     }
// }












