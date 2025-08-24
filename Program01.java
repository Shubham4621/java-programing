import java.util.Scanner;

public class Program01 {
    // Method to calculate factorial
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial is: " + fact(n));

        sc.close(); // good practice
    }
}
