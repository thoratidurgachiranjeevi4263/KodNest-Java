import java.util.Scanner;
class Addition implements Runnable {
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
class PrintNumber implements Runnable {
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
class PrintChar implements Runnable {
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
class MultyThread2 {
  public static void main(String[] args) {
    Addition ad = new Addition();
    PrintNumber pn = new PrintNumber();
    PrintChar pc = new PrintChar(); 
    Thread t1 = new Thread(ad);
    Thread t2 = new Thread(pn);
    Thread t3 = new Thread(pc);
    t1.start();
    t2.start();
    t3.start();
  }

    }