import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class CallableStatementExample {

    public static void main(String[] args) {

        // Replace these placeholders with your own database details locally.
        String url = "jdbc:sqlserver://YOUR_SERVER_NAME;"
                   + "databaseName=YOUR_DATABASE_NAME;"
                   + "integratedSecurity=true;"
                   + "trustServerCertificate=true";

        try {
            Connection con = DriverManager.getConnection(url);

            CallableStatement cstmt =
                con.prepareCall("{call GetStudentById(?)}");

            cstmt.setInt(1, 1001);

            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Fee: " + rs.getDouble("fee"));
            }

            rs.close();
            cstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error while calling the stored procedure!");
            e.printStackTrace();
        }
    }
}
