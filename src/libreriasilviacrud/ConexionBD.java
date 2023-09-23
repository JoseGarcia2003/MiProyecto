
package libreriasilviacrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/libreria_silvia_db"; 
    private static final String USUARIO = "root"; 
    private static final String CONTRASEÑA = ""; 

    public static Connection conectar() throws SQLException {
        Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        return conexion;
    }
    try {
    Connection conexion = ConexionBD.conectar();
    // Realiza consultas y operaciones en la base de datos aquí
    // No olvides cerrar la conexión cuando hayas terminado.
    conexion.close();
} catch (SQLException ex) {
    // Manejo de excepciones
}
   public static boolean agregarProducto(Producto producto) {
        // Código para agregar el producto a la base de datos
    }

    public static boolean actualizarProducto(Producto producto) {
        // Código para actualizar el producto en la base de datos
    }

    public static boolean eliminarProducto(String codigo) {
        // Código para eliminar el producto de la base de datos
    }

    public static ArrayList<Producto> obtenerProductos() {
        // Código para obtener todos los productos de la base de datos
    }
}




    

