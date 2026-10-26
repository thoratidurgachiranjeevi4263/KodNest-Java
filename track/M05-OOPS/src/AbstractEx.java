abstract class Parent {
  abstract void disp1();
  abstract void disp2();
}
class child1 extends Parent {
  @Override
  void disp1() {
    System.out.println("Inside child 1 disp1");
  }
  @Override
  void disp2() {
    System.out.println("Inside child 1 disp2");
  }
}
class child2 extends Parent {
  @Override void disp1() {
    System.out.println("Inside child 2 disp1");
  }
  @Override void disp2() {
    System.out.println("Inside child 2 disp2");
  }
}
class AbstractEx {
  public static void main(String[] args) {
    child1 c1 = new child1();
    child2 c2 = new child2();
    accessMethods(c1);
    accessMethods(c2);
  }
  public static void accessMethods(Parent p) {
    p.disp1();
    p.disp2();
  }
}