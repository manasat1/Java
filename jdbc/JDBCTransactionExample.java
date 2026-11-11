import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCTransactionExample {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query =
            "UPDATE studentinfo SET fee = ? WHERE id = ?";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url);

            // Disable auto-commit to start a transaction
            con.setAutoCommit(false);

            PreparedStatement pstmt =
                con.prepareStatement(query);

            // First update
            pstmt.setDouble(1, 60000);
            pstmt.setInt(2, 1001);
            pstmt.executeUpdate();

            // Second update
            pstmt.setDouble(1, 65000);
            pstmt.setInt(2, 1002);
            pstmt.executeUpdate();

            // Save both changes permanently
            con.commit();

            System.out.println("Transaction completed successfully!");

            pstmt.close();

        } catch (SQLException e) {

            try {
                if (con != null) {
                    // Undo changes if an error occurs
                    con.rollback();
                    System.out.println("Transaction failed. Changes rolled back.");
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
