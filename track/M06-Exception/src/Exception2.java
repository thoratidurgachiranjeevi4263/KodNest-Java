import java.util.Scanner;
public class Exception2 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
  System.out.println("Connection Established");
  try {
      System.out.println("Enter the number A");
    
      int a = sc.nextInt();
      System.out.println("Enter the number B");
      int b = sc.nextInt();
      int c = a / b;
      System.out.println("Result: " + c);
      System.out.println("Enter the size of the array");
      int size = sc.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter the elements of the array");
      int element = sc.nextInt();
      System.out.println("Enter the index of the array");
      int index = sc.nextInt(); 
      arr[index] = element;
      System.out.println("Element inserted successfully");

    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception: " + e.getMessage());
    } catch (NegativeArraySizeException e) {
      System.out.println("Exception: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
    System.out.println("Connection Closed");
    sc.close();
  }
}
