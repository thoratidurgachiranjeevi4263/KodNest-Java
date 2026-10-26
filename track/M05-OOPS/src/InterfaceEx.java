interface Shape {
  abstract void inout();
  abstract void disp();
}
class Square implements Shape {
  @Override
  public void inout() {
    System.out.println("Input");
  }

  @Override
  public void disp() {
    System.out.println("Display");  
  }
}
class InterfaceEx {
  public static void main(String[] args) {
    Square s = new Square();
    Shape sh = s;
    sh.inout();
    sh.disp();
  }
}