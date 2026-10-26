import java.util.Scanner;

public class ThreeDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of blocks,rows,columns: ");
        int block = sc.nextInt();
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][][] = new int[block][row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("The elements of 3D Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " | ");
                }
                System.out.println("---------------");
            }
        }
    }
}