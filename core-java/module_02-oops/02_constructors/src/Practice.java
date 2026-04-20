class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Practice {
    public static void main(String[] args) {

        Car c1 = new Car("Lamborghini", 350);
        Car c2 = new Car("BMW", 250);

        c1.display();
        c2.display();
    }
}