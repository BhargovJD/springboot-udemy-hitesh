
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // Create a Set of names
//        A Set does not allow duplicate values.
        Set<String> names = new HashSet<>();

        // Add elements to the Set
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul"); // Duplicate is ignored

        // Print the Set
        System.out.println(names);

        // Check whether a name exists
        System.out.println(names.contains("Amit"));
    }
}
