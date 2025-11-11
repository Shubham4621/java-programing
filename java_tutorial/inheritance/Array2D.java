import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] mA = new int[3][3];
        int[][] mB = new int[3][3];
        int[][] sum = new int[3][3];
        int[][] product = new int[3][3];

        Scanner x = new Scanner(System.in);

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mA[i][j] = x.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mB[i][j] = x.nextInt();
            }
        }

        // Matrix Addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = mA[i][j] + mB[i][j];
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        System.out.println("Addition of Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
