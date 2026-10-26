public class String8 {
    public static void main(String[] args) {
        String s = "java";
        char ch[] = s.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }
        String res = new String(ch);
        System.out.println(res);
    }
}
