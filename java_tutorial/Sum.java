import java.util.Scanner;
class marks{
    int sub1;
    int sub2;
}

class Total extends marks{
    int total;
    public void calctotal(){
        total = sub1 + sub2;
    }
}

class Average extends Total{
    float avg;
    public void calcavg(){
        avg = (float) total / 2;
    }
    public void display(){
        System.out.println("Average of the marks is:"+avg);
    }
}

public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Average a1 = new Average();
        System.out.println("Enter the marks of subject 1:");
        a1.sub1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2:");
        a1.sub2 = sc.nextInt();

        a1.calctotal();
        a1.calcavg();
        a1.display();


    }
}

