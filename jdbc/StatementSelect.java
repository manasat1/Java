import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class StatementSelect {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(url);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM studentinfo");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + ", " +
                    rs.getString(2) + ", " +
                    rs.getDouble(3)
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while retrieving data!");
            e.printStackTrace();
        }
    }
}
