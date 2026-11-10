import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class StatementInsert {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(url);

            Statement stmt = con.createStatement();

            String query =
                "INSERT INTO studentinfo VALUES (1003, 'Ravi', 55000)";

            int rowsAffected = stmt.executeUpdate(query);

            System.out.println(rowsAffected + " record inserted successfully!");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while inserting data!");
            e.printStackTrace();
        }
    }
}
