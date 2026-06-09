import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3307/hostel_feedback";

    private static final String USER = "root";

    private static final String PASSWORD = "9885640717";

    public static Connection connect() {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Connected Successfully!");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return conn;
    }
}