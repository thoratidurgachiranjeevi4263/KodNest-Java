import java.util.Scanner;
class Addition extends Thread {
  @Override 
  public void run() {
    System.out.println("Addition Thread is started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number A");
    int a = sc.nextInt();
    System.out.println("Enter the number B");
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Result: " + c);
    System.out.println("Addition Thread is completed");
    sc.close();
  }
}
class PrintNumber extends Thread {
  @Override public void run() {
    System.out.println("PrintNumber Thread is started");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println("Exception: " + e.getMessage());
      }
    }
    System.out.println("PrintNumber Thread is completed");
  }
}
class PrintChar extends Thread {
  @Override 
  public void run() {
    System.out.println("PrintChar Thread is started");
    for (char ch = 'A'; ch <= 'G'; ch++) {
      System.out.println(ch);
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println("Exception: " + e.getMessage());
      }
    }
    System.out.println("PrintChar Thread is completed");
  }
}
class MultyThred {
  public static void main(String[] args) {
    Addition ad = new Addition();
    PrintNumber pn = new PrintNumber();
    PrintChar pc = new PrintChar(); 
    ad.start();
    pn.start();
    pc.start();
  }

    }