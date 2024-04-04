import db.Db;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = Db.getConnection();
        Db.closeConnection();
    }
}
