
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // Create an empty Optional
        Optional<String> name = Optional.empty();

        // Provide a default value if the name is missing
        String result = name.orElse("Guest");

        // Print the result
        System.out.println(result);
    }
}
