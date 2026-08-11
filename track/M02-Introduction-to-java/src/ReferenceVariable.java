class Employee {
    int id;
    String name;
}

class ReferenceVariable {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 10;
        e1.name = "Durga";
        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2;
        e2 = e1;
        e2.id = 20;
        e2.name = "chiru";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }
}