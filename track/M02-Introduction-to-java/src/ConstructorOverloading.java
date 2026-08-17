class ConsOverloading {
    String name;
    int age;
    double height;

    ConsOverloading(String name) {
        this.name = name;
    }

    ConsOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ConsOverloading(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        ConsOverloading c1 = new ConsOverloading("Durga");
        ConsOverloading c2 = new ConsOverloading("Durga", 23);
        ConsOverloading c3 = new ConsOverloading("Durga", 23, 5.4);
        c1.display();
        c2.display();
        c3.display();
    }
}
