public class String4 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("ref are same");
        } else {
            System.out.println("ref are not same");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("both are same values");
        } else {
            System.out.println("both are not same values");
        }
    }
}
