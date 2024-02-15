package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
 Connection conectar = null;

    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int port = 3307;
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/arcade?user=root&password=");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
            System.out.println("Error en la conexion: " + e);

        }

        return conectar;
    }
    
}
