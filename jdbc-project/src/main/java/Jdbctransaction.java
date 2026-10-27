
import java.sql.*;

public class Jdbctransaction {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
        String username = "postgres";
        String password = "password";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            // Disable auto-commit to start a transaction
            connection.setAutoCommit(false);

            try {
                // First operation: insert a course
                String sql1 =
                        "INSERT INTO public.courses (id, title) VALUES (?, ?)";

                try (PreparedStatement ps1 = connection.prepareStatement(sql1)) {
                    ps1.setInt(1, 101);
                    ps1.setString(2, "Java");
                    ps1.executeUpdate();
                }

                // Second operation: insert another course
                String sql2 =
                        "INSERT INTO public.courses (id, title) VALUES (?, ?)";

                try (PreparedStatement ps2 = connection.prepareStatement(sql2)) {
                    ps2.setInt(1, 102);
                    ps2.setString(2, "Spring Boot");
                    ps2.executeUpdate();
                }

                // Save both operations permanently
                connection.commit();

                System.out.println("Transaction successful!");

            } catch (SQLException e) {

                // Undo all changes made in this transaction
                connection.rollback();

                System.out.println("Transaction failed. Changes rolled back.");
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}
