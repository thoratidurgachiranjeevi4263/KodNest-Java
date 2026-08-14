class Students {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
    }
}

class StudentApplication {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.input("Durga", 23, 5.3);
        s1.display();
    }
}