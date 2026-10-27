
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

        } catch (SQLException e) {

            // Handle database connection errors
            System.out.println("Error connecting to the database: "
                    + e.getMessage());
        }
    }
}
