import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:sqlserver://MANASAREDDY\\SQLEXPRESS;"
                + "databaseName=issdb;"
                + "integratedSecurity=true;"
                + "trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(url)) {

            System.out.println("Database connected successfully!");

        } catch (SQLException e) {

            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
