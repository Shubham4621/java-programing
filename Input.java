import javax.sound.sampled.SourceDataLine;

inport java.util.Scanner;
public class Input {
    int num1,num2,sum,diff,prod,div;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    num1 = sc.nextInt();
    System.out.println("Enter second number:");
    num2 = sc.nextInt();

    sum = num1 + num2;
    diff = num1 - num2;
    prod = num1 * num2;
    div = num1/num2;

    System.out.println("Addition is:"+sum);
    System.out.println("Substraction is:"+diff);
    System.out.println("Multiplication is:"+prod);
    System.out.println("Division is:"+div);


    
    
}
