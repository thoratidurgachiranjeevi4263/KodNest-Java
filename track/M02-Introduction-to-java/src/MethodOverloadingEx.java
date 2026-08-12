class MethodOverloading {
   int add(int a, int b) {
      return a + b;
   }

   double add(double a, double b) {
      return a + b;
   }

   int add(int a, int b, int c) {
      return a + b + c;
   }

   double add(double a, double b, double c) {
      return a + b + c;
   }

   double add(int a, double b) {
      return a + b;
   }

   double add(double a, int b) {
      return a + b;
   }
}

public class MethodOverloadingEx {
   public static void main(String[] args) {
      MethodOverloading m = new MethodOverloading();
      System.out.println(m.add(10, 20));
      System.out.println(m.add(22.3, 22.3));
      System.out.println(m.add(10, 20, 30));
      System.out.println(m.add(22.3, 22.5, 22.6));
      System.out.println(m.add(10, 20.3));
      System.out.println(m.add(20.3, 20));

   }
}