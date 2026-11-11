import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class PreparedStatementUpdate {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query =
            "UPDATE studentinfo SET name = ?, fee = ? WHERE id = ?";

        try {
            Connection con = DriverManager.getConnection(url);

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, "Rahul");
            pstmt.setDouble(2, 65000);
            pstmt.setInt(3, 1001);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }

            pstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while updating data!");
            e.printStackTrace();
        }
    }
}
