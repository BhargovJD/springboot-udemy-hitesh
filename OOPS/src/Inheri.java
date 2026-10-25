// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Inheri {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();  // Inherited from Animal
        d.bark(); // Defined in Dog
    }
}