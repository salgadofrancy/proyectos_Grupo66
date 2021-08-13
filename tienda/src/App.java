import modelo.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import conexion.SqliteConnection;
import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*La Tienda de Ropa**");

        SqliteConnection conexionBD = new SqliteConnection();
        Menu menuPrincipal = new Menu();
        menuPrincipal.generarMenu(conexionBD);

        // Producto productoUno = new Producto();

        // productoUno.setNombre("Falda");
        // productoUno.setPrecio(70000);
        // productoUno.mostrar();

        /*Se crea conexión a la base de datos*/
        
        //////////// Ejemplo consulta /////////////////////
        ResultSet resultado = conexionBD.ejecutarConsulta("SELECT * FROM PRODUCTOS");
        while(resultado.next()) {
            String codiBarras = resultado.getString("CodigoBarras");
            String nomProducto = resultado.getString("nombre");
            float precioProd = resultado.getFloat("precio");

            System.out.println(codiBarras + " " + nomProducto + " $" + precioProd);
        }

        ///////////////-- Creación y consulta de clientes --/////////////////////

        /*JOptionPane*/
        String prueba = JOptionPane.showInputDialog(null, "Cuál es su nombre?", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hola Mundo", "SALUDO", JOptionPane.WARNING_MESSAGE);
        String ident = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);

        /*Objeto cliente*/
        Cliente nuevoCliente = new Cliente(ident, nombre, apellido);

        /*Objeto ClienteDAO para insertar cliente*/
        ClienteDAO cli1 = new ClienteDAO();
        cli1.insertarCliente(nuevoCliente, conexionBD);

        /*Consulta cliente*/
        String clientes = cli1.mostrarClientes(conexionBD);
        JOptionPane.showMessageDialog(null, clientes, "Listado de clientes", JOptionPane.INFORMATION_MESSAGE);

    }

}
