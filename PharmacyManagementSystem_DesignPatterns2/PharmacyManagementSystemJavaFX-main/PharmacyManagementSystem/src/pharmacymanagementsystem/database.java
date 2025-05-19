package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ===== Singleton Pattern =====
 * This class ensures only one instance of the database connection is created and reused.
 */
public class database {

    private static database instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost/pharamacy";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Private constructor to prevent instantiation
    private database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Public method to get the singleton instance
    public static synchronized database getInstance() {
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    // Method to get the connection
    public Connection getConnection() {
        return connection;
    }
}
