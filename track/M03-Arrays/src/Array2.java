package src;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Reverse of the array");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
