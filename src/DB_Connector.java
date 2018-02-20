import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connector {

    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String user = "postgres";
    private static String pass = "1234";
    private static Connection conn = null;

    public static Connection connect() {
        System.out.println("\n -- Connecting to PostgreSQL JDBC --");

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("\n -- Connection successful! --");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n -- Connection failed! --");
        }

        if (conn != null) {
            System.out.println("\n -- Connection successful! --");
        } else {
            System.out.println("\n -- Connection failed! --");
        }

        return conn;
    }
}
