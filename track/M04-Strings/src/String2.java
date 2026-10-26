public class String2 {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        if (s1 == s2) {
            System.out.println("ref are same");
        } else {
            System.out.println("ref are not same");
        }
    }
}
