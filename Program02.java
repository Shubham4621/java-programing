import java.util.Scanner;
public class Program02 {
    public static int max(int num1,int num2){
        if(num1>num2){
            return num1;
        } else{
            return num2;
        }
       
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("maximum number is:"+max(num1,num2));
        
       
    }

    
}