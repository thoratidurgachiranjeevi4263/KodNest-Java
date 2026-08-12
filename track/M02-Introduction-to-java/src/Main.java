class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("name > " + name);
        System.out.println("Age > " + age);
        System.out.println("height > " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.input("Durga", 21, 176.5);
        s.display();
    }
}