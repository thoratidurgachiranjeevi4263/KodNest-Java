public class FlowsAndLoops {
    public static void main(String[] args) {
        int num = -7;
        int firstnum = 18;
        int secondnum = 25;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        if (firstnum > secondnum) {
            System.out.println("Larger number:" + firstnum);
        } else {
            System.out.println("Larger number:" + secondnum);
        }
        if (num % 2 == 0) {
            System.out.println("Type : Even");
        } else {
            System.out.println("Type : Odd");
        }
    }
}