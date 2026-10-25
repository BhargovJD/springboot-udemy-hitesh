// Interface
interface Vehicle {
    void start();
}

// First class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

// Second class
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a button");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}