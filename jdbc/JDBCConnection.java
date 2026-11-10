import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCConnection {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(url);

            System.out.println("Database connected successfully!");

            con.close();

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
