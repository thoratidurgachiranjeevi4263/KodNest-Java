public class String5 {
    public static void main(String[] args) {
        String s = "Durga Chiranjeevi";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('e'));
        System.out.println(s.startsWith("Durg"));
        System.out.println(s.endsWith("eevi"));
        System.out.println(s.contains("Chir"));
        System.out.println(s.replace('a', 'e'));
        System.out.println(s.substring(6));
        System.out.println(s.substring(6, 15));
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        String s2 = "   java   ";
        System.out.println(s2);
        s2 = s2.trim();
        System.out.println(s2);
    }
}
