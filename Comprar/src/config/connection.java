package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connection {
    Connection oraclesql;
    
    public connection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            oraclesql = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","biblioteca","123456");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error (connection): "+ e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return oraclesql;
    }
}
