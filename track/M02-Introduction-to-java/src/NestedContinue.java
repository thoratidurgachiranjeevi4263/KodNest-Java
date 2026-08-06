public class NestedContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i : " + i + "  j : " + j);
            }
            System.out.println();
        }
    }
}
