
class StudentAppv2 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Amar");
        Student s3 = new Student(11, "Arjun");
        Object s4 = new Student(13, "Kiran");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s3.getClass().getSimpleName());
        System.out.println(s4.getClass().getSimpleName());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
