// final class Vehicle{
//     final int speedlimit = 80;
//     final void displayspeed(){
//         System.out.println("Speedlimit of the Car is:"+speedlimit);
//     }

// }

// public class Finaldemo{
//     public static void main(String args[]){
//         Vehicle v1 = new Vehicle();
//         v1.speedlimit = 40;
//         v1.displayspeed();
//     }
// }

public class Staticdemo{
    static int count = 40;
    static{
        System.out.println("Static method is called..");
        System.out.println("Value of count is:"+count);
    }

    Staticdemo(){
        System.out.println("Inside the constructor..");
    }

    public static void main(String args[]){
        System.out.println("Inside the main function..");
        Staticdemo d1 = new Staticdemo();
    }
}


