public class Car {
    static void kmToMiles() {
        System.out.println("Converting KM to MILES");
    }

    void calculateMilage() {
        System.out.println("Calculating the milage");
    }
}

class Main {
    public static void main(String[] args) {
        Car.kmToMiles();
        Car car = new Car();
        car.calculateMilage();
    }
}
