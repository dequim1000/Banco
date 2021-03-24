package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost/test";
            String usuario = "root";
            String senha = "";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }
}
