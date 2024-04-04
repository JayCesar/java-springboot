import db.Db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // São recursos externos não controlados pela JVM que eu preciso fechar
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = Db.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("Select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Db.closeResultSet(rs); // rs.close() Pode lançar uma exceção
            Db.closeStatement(st); // sc.close() Pode lançar uma exceção
            Db.closeConnection();
        }
    }
}