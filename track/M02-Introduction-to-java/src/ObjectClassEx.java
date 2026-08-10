class ObjectClassEx {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 11;
        s1.name = "nani";
        s1.height = 5.6;
        System.out.println(s1.name + "\n " + s1.roll + "\n " + s1.height);
        s1.run();
        s1.sleep();
    }
}

class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Student is running");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }
}
