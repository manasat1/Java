import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementSelect {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query =
            "SELECT * FROM studentinfo WHERE id = ?";

        try {
            Connection con = DriverManager.getConnection(url);

            PreparedStatement pstmt =
                con.prepareStatement(query);

            pstmt.setInt(1, 1001);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Fee: " + rs.getDouble(3));
            }

            rs.close();
            pstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while retrieving data!");
            e.printStackTrace();
        }
    }
}
