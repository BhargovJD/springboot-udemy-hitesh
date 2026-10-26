
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // Create a Map with String keys and Integer values
//        A Map stores data as key-value pairs. Each key must be unique, but values can be duplicated.
        Map<String, Integer> students = new HashMap<>();

        // Add key-value pairs
        students.put("Rahul", 85);
        students.put("Amit", 90);
        students.put("Priya", 85);

        // Print the Map
        System.out.println(students);

        // Get Rahul's marks using the key
        System.out.println(students.get("Rahul"));

        // Check whether a key exists
        System.out.println(students.containsKey("Amit"));
    }
}
