package src;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[size - 1];
        System.out.println("enter position");
        int pos = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        for (int i = pos; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
