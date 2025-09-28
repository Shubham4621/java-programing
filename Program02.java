import java.util.Scanner;
import java.util.Arrays;
public class Program02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Enter array element:");
        for(int i=0;i<10;i++){
            System.out.printf("A[%d]:",i);
            A[i] = sc.nextInt();
        }

        int num;
        System.out.println("Enter number to search:");
        num = sc.nextInt();

        for(int i=0;i<10;i++){
            if(num == A[i]){
                System.out.println(num +" Found at index "+i);
            }
        }
        sc.close();

    }

    
}