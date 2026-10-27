
import java.sql.*;
import java.util.Scanner;

public class JdbcConnection {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
        String username = "postgres";
        String password = "password";

        // Establish database connection
        // Driver jar must be on the classpath (Maven dependency + IntelliJ Maven reload)
        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            // Check whether the connection is open
            System.out.println("Connected: " + !connection.isClosed());

            // Get the database name
            System.out.println("Database Name: " + connection.getCatalog());

            // Get the JDBC driver name
            System.out.println("Driver Name: "
                    + connection.getMetaData().getDriverName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course title: ");
        String title = scanner.nextLine();

        findCourseByTitle(connection, title);

        } catch (SQLException e) {

            // Handle database connection errors
            System.out.println("Error connecting to the database: "
                    + e.getMessage());
        }
    }


    public static void findCourseByTitle(Connection connection, String title) {

        // SQL query to search for a course by its title
        String sql = "SELECT * FROM public.courses WHERE title = ?";
    
        try {
            // Prepare the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
    
            // Set the course title in the first ? placeholder
            preparedStatement.setString(1, title);
    
            // Execute the SELECT query
            ResultSet resultSet = preparedStatement.executeQuery();
    
            // Check whether a matching course exists
            while (resultSet.next()) {
    
                // Retrieve the course ID
                int id = resultSet.getInt("id");
    
                // Retrieve the course title
                String courseTitle = resultSet.getString("title");
    
                // Print the course details
                System.out.println("ID: " + id + ", Title: " + courseTitle);
            }
    
        } catch (SQLException e) {
    
            // Display an error if the query fails
            System.out.println("Error finding course by title: " + e.getMessage());
        }
    }
    
}
