package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public static Connection connection;
    
    public static Connection getConnection() {
        try {
            if (connection == null) {
                Runtime.getRuntime().addShutdownHook(new getClose());
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbexample", "root", "toor");
                System.out.println("Entro al if");
            }
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Conexión fallida", e);
        }
    }
    
    static class getClose extends Thread{
        @Override
        public void run() {
            try {
                Connection conn = ConexionMySQL.getConnection();
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
