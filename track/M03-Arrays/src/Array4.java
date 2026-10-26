package src;
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            b[i] = a[i];
        }
        System.out.print("enter new element");
        int element = sc.nextInt();
        b[b.length - 1] = element;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
