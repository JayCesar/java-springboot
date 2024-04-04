package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES" 
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS); // fazendo isso eu retorno o ID da nova informação qeu adicionei
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			
			// Para executar o comando:
			int rowsAffected = st.executeUpdate();
			// Quando é uma oepração em que eu vou alterar os dados eu utilizo update
			// O resultado dessa oepração é um número inteiro indicando quantas linhas foram alteradas
		
			if(rowsAffected > 0) {
				// st.getGeneratedKeys(); retorna um objeto do tipo ResultSet
				ResultSet rs = st.getGeneratedKeys(); // E pode ter mais de um valor
				while(rs.next()) {
					int id = rs.getInt(1); // Assim indico que quero o valor da primeria coluna, pois estamos inserindo apenas um
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No Rows affected!");
			}
			
			// 
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally{
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
