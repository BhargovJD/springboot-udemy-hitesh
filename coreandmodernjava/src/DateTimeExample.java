
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {

        // Get the current date
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        // Get the current time
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        // Get both date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);
    }
}
