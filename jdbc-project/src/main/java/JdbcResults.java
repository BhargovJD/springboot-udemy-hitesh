
import java.sql.*;
import java.util.Scanner;

public class JdbcResults {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
        String username = "postgres";
        String password = "password";

        // Create Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Establish database connection
        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Connected successfully!");

            // Display all courses
            System.out.println("\n--- All Courses ---");
            findAllCourses(connection);

            // Ask the user to enter a course title
            System.out.print("\nEnter the course title to search: ");
            String title = scanner.nextLine();

            // Search for the entered course
            System.out.println("\n--- Search Result ---");
            findCourseByTitle(connection, title);

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        // Close Scanner
        scanner.close();
    }

    public static void findAllCourses(Connection connection) {

        String sql = "SELECT * FROM public.courses ORDER BY id ASC";

        // Create PreparedStatement and ResultSet using try-with-resources
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            // Move to the next row
            while (rs.next()) {

                // Read values from the current row
                int id = rs.getInt("id");
                String title = rs.getString("title");

                // Display the current row
                System.out.println("ID: " + id + ", Title: " + title);
            }

        } catch (SQLException e) {
            System.out.println("Error finding courses: " + e.getMessage());
        }
    }

    public static void findCourseByTitle(Connection connection, String title) {

        // ? is a placeholder for the course title
        String sql = "SELECT * FROM public.courses WHERE title = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            // Replace ? with the user's input
            ps.setString(1, title);

            // Execute query and get matching rows
            try (ResultSet rs = ps.executeQuery()) {

                // Check whether a matching row exists
                if (rs.next()) {

                    int id = rs.getInt("id");
                    String courseTitle = rs.getString("title");

                    System.out.println(
                            "ID: " + id + ", Title: " + courseTitle
                    );

                } else {
                    System.out.println("Course not found!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching course: " + e.getMessage());
        }
    }
}
