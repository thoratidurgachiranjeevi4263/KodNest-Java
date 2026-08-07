import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Byte number: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is: " + a);
        System.out.print("Enter Short Value: ");
        short b = sc.nextShort();
        System.out.println("Short vallue is: " + b);
        System.out.print("Enter integer value:");
        int c = sc.nextInt();
        System.out.println("Integer value is :" + c);
        System.out.print("Enter Long value: ");
        long d = sc.nextLong();
        System.out.println("Long value is: " + d);
        System.out.print("Enter float value: ");
        float e = sc.nextFloat();
        System.out.println("Float value is: " + e);
        System.out.print("Enter boolean value: ");
        boolean f = sc.nextBoolean();
        System.out.println("Boolean value: " + f);
        System.out.print("Enter double value: ");
        double g = sc.nextDouble();
        System.out.println("Double value is: " + g);
        System.out.print("Enter your age: ");
        int h = sc.nextInt();
        System.out.println("Age :" + h);
        sc.nextLine();
        System.out.print("Enter your full name");
        String i = sc.nextLine();
        System.out.println("Name: " + i);

    }
}