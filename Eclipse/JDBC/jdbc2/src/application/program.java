package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class program {

	public static void main(String[] args) {
		
		// São recursos externos não controlados pela JVM que eu preciso fechar
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			conn = DB.getConnection();
			
			st = conn.createStatement();
	
			rs = st.executeQuery("Select * from department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("name"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs); // rs.close() Pode lançar uma exceção 
			DB.closeStatement(st); // sc.close() Pode lançar uma exceção 
			DB.closeConnection();
		}
		
	}
}
