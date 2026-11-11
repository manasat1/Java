import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ResultSetExample {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query = "SELECT * FROM studentinfo";

        try {
            Connection con = DriverManager.getConnection(url);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                // Retrieving values using column names
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double fee = rs.getDouble("fee");

                System.out.println(
                    "ID: " + id
                    + ", Name: " + name
                    + ", Fee: " + fee
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
