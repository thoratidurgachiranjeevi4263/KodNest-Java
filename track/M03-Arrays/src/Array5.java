package src;
import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[size + 1];
        System.out.println("enter position");
        int pos = sc.nextInt();
        System.out.println("enter new element");
        int element = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        b[pos] = element;
        for (int i = pos; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
