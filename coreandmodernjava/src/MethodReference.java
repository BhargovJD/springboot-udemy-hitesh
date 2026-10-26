import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    // Create a static method
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Create a list of names
        List<String> names = Arrays.asList("Rahul", "Amit", "Priya");

        // Call the sayHello method using a method reference
        names.forEach(MethodReference::sayHello);


//        Using a lambda instead
        names.forEach(name -> sayHello(name));
    }
}
