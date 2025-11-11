import java.util.*;

public class Array1D {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt();
        }

        System.out.println("Array Elements are:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
