class A {
    void m(short a, short b) {
        System.out.println(a + b);
    }

    void m(int a, int b) {
        System.out.println(a + b);
    }
}

class Main1 {
    public static void main(String[] args) {
        A a = new A();
        a.m(10, 10); //20
    }
}
