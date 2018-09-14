
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CESARDOMINGO
 */
public class Conectado {

    Connection conector = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conector = DriverManager.getConnection("jdbc:mysql://localhost:3307/correo?autoReconnect=true&useSSL=false", "root", "javac");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conector;
    }
}
