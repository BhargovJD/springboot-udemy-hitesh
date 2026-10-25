// Abstract parent class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void move();

    // Normal method (has a body)
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Child class
class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Car is driving");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); // ERROR

        Car c = new Car();
        c.move();
        c.stop();
    }
}