package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Db {

    private static Connection conn = null;

    // Método para conectar com o banco de dados:
    public static Connection getConnection() {
        if (conn == null) {

            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
                System.out.println("Conexão feita!");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
        return conn;
    }

    // Método para fechar a conexão
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }


    // Método para carregar as propriedades do banco de dados:
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            // esse props.load(fs) vai fazer a leitura do arquivo properties apontadado pelo meu InputStreamFs e vai guardar os dados dentro do objeto props
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }

    }
}
