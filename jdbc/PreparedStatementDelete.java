import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class PreparedStatementDelete {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query = "DELETE FROM studentinfo WHERE id = ?";

        try {
            Connection con = DriverManager.getConnection(url);

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 1004);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }

            pstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while deleting data!");
            e.printStackTrace();
        }
    }
}
