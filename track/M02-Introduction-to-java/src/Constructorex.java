class ConstructorStudent {
    String name;
    int age;
    double height;

    public ConstructorStudent(String name, int age, double height) {
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

class Constructorex {
    public static void main(String[] args) {
        ConstructorStudent s = new ConstructorStudent("Durga", 23, 5.4);
        s.display();
    }
}
