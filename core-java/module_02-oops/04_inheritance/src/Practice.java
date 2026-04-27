class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Practice {
    public static void main(String[] args) {

        Car c = new Car();

        c.start(); // inherited
        c.drive(); // own
    }
}