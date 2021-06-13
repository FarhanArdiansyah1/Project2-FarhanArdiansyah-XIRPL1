package gradleproject1;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HanRey
 */
 public class DbCon {
    public static Connection getConn(String host, String port, String username, String password, String dataBaseName) {
        String configJdbc = "jdbc:mysql://" + host + ":" + port + "/" + dataBaseName;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(configJdbc,
            username, password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi Database Error");
            conn = null;
        }
        return conn;
    }
}