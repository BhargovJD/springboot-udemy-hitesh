
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        // Create a list of numbers
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30);

        // Create a stream, filter even numbers, and print them
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
//Step by step process
