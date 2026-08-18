import java.util.Scanner;

class SearchElement {
    void search(int b[], int key) {
        boolean found = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
}

public class FindArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter key");
        int key = sc.nextInt();
        SearchElement s = new SearchElement();
        s.search(a, key);
    }
}
