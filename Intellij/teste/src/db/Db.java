package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Db {

    private static Connection conn = null;

    // Método para conectar com o banco de dados:
    public static Connection getConnection() {
        Properties properties = new Properties();
        try {
            // Carregar as propriedades do arquivo de configuração
            properties.load(new FileInputStream("config.properties"));

            // Obter os valores das propriedades
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            // Conectar ao banco de dados usando os valores obtidos
            System.out.println("URL do banco de dados: " + url);
            System.out.println("Usuário do banco de dados: " + user);
            System.out.println("Senha do banco de dados: " + password);

            conn =  DriverManager.getConnection(url, properties);
            return conn;
        } catch (SQLException e) {
            System.err.println("Erro ao ler o arquivo de configuração: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    // Método para fechar a conexão
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch(SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }



    public static void closeStatement(Statement st) {
        if(st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }


    public static void closeResultSet(ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
