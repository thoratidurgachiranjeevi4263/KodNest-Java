import java.util.Scanner;
public class Exception1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Connection Established");
    System.out.println("Enter the number");
    int a = sc.nextInt();
    System.out.println("Enter the number");
    int b = sc.nextInt();
    try {
      int c = a / b;
      System.out.println("Result: " + c);
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
    System.out.println("Connection Closed");
  }
}
