import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class PreparedStatementInsert {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        String query =
            "INSERT INTO studentinfo VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url);

            PreparedStatement pstmt =
                con.prepareStatement(query);

            pstmt.setInt(1, 1004);
            pstmt.setString(2, "Anjali");
            pstmt.setDouble(3, 60000);

            int rowsAffected = pstmt.executeUpdate();

            System.out.println(
                rowsAffected + " record inserted successfully!"
            );

            pstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while inserting data!");
            e.printStackTrace();
        }
    }
}
