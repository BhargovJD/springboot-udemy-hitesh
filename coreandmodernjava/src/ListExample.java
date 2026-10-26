
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Create a List of names
//        A List allows duplicate values and maintains insertion order.
        List<String> names = new ArrayList<>();

        // Add elements to the List
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul"); // Duplicate values are allowed

        // Print the List
        System.out.println(names);

        // Access an element using its index
        System.out.println(names.get(1));
    }
}
