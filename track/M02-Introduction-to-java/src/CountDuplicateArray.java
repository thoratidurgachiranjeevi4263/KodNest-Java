import java.util.Scanner;

class Freq {
    void count(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}

public class CountDuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Freq f = new Freq();
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter target :");
        int target = sc.nextInt();
        f.count(a, target);
    }
}
