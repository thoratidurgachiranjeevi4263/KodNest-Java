public class ObjectCount {
    static int count;
    {
        count++;
    }
}

class ObjectCountApp {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            ObjectCount ob = new ObjectCount();
        }
        System.out.println("Number of objects: " + ObjectCount.count);
    }
}
