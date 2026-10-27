
import java.sql.*;
import java.util.Scanner;

public class JdbcInsert {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
        String username = "postgres";
        String password = "password";

        // Read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter course title: ");
        String title = scanner.nextLine();

        // SQL query to insert a course
        String sql = "INSERT INTO public.courses (id, title) VALUES (?, ?)";

        // Establish connection and execute the insert
        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             PreparedStatement ps = connection.prepareStatement(sql)) {

            // Set the values for the placeholders
            ps.setInt(1, id);
            ps.setString(2, title);

            // Execute the INSERT query
            int rowsInserted = ps.executeUpdate();

            // Check whether the record was inserted
            if (rowsInserted > 0) {
                System.out.println("Course inserted successfully!"+rowsInserted);
            }

        } catch (SQLException e) {
            System.out.println("Error inserting course: " + e.getMessage());
        }

        // Close Scanner
        scanner.close();
    }
}
