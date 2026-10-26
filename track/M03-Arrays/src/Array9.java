package src;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 50, 40, 30, 20, 10 };
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
            i++;
            j--;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
