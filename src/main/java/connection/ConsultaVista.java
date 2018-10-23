package connection;

// Fig. 28.29: JdbcRowSetTest.java
// Displaying the contents of the authors table using JdbcRowSet.
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl; // Sun's JdbcRowSet implementation
import Modelo.*;

public class ConsultaVista {
	// JDBC driver name and database URL
	static final String DATABASE_URL = DbPropertiesReader.getString("db.url");
	static final String USERNAME = DbPropertiesReader.getString("db.user");
	static final String PASSWORD = DbPropertiesReader.getString("db.password");

	public static void main(String args[]) {
	}

	public static Empleado autenticar(String usuario, String contrasena) {
		Empleado empleado = new Empleado();

		// connect to database books and query database
		try {
			// specify properties of JdbcRowSet
			JdbcRowSet rowSet = new JdbcRowSetImpl();
			rowSet.setUrl(DATABASE_URL); // set database URL
			rowSet.setUsername(USERNAME); // set username
			rowSet.setPassword(PASSWORD); // set password
			System.out.println("--------------------------------------------------");
			rowSet.setCommand("SELECT * FROM Empleado where Usuario = '" + usuario + "'"); // set query
			rowSet.execute(); // execute query

			rowSet.next();
			// System.out.printf(rowSet.getString(10));
			System.err.println("USUARIO NO ENCONTRADO");
			if (contrasena.equals(rowSet.getString(10))) {
				empleado.setUsuario(rowSet.getString(9));
				empleado.setCargo(rowSet.getString(7));
			}
			rowSet.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
		return empleado;
	}

	public static ArrayList<Empleado> consultaEmpleados() {

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		// connect to database books and query database
		try {
			// specify properties of JdbcRowSet
			JdbcRowSet rowSet = new JdbcRowSetImpl();
			rowSet.setUrl(DATABASE_URL); // set database URL
			rowSet.setUsername(USERNAME); // set username
			rowSet.setPassword(PASSWORD); // set password
			System.out.println("--------------------------------------------------");
			rowSet.setCommand("SELECT * FROM Empleado"); // set query
			rowSet.execute(); // execute query

			ResultSetMetaData metaData = rowSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			while (rowSet.next()) {
				Empleado persona = new Empleado();
				persona.setCodigo(rowSet.getString(1));
				persona.setNombre(rowSet.getString(2));
				persona.setCedula(rowSet.getString(3));
				persona.setTelefono(rowSet.getString(4));
				persona.setDireccion(rowSet.getString(5));
				persona.setFechaNacimiento(rowSet.getString(6));
				persona.setCargo(rowSet.getString(7));
				persona.setSalario(rowSet.getDouble(8));
				persona.setUsuario(rowSet.getString(9));
				persona.setContrasena(rowSet.getString(10));
				empleados.add(persona);
			}

			rowSet.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
		return empleados;
	}

	public static ArrayList<ProductoInventario> consultaInventario() {

		ArrayList<ProductoInventario> productos = new ArrayList<ProductoInventario>();

		// connect to database books and query database
		try {
			// specify properties of JdbcRowSet
			JdbcRowSet rowSet = new JdbcRowSetImpl();
			rowSet.setUrl(DATABASE_URL); // set database URL
			rowSet.setUsername(USERNAME); // set username
			rowSet.setPassword(PASSWORD); // set password
			System.out.println("--------------------------------------------------");
			rowSet.setCommand("SELECT * FROM Inventario"); // set query
			rowSet.execute(); // execute query

			ResultSetMetaData metaData = rowSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			while (rowSet.next()) {
				ProductoInventario producto = new ProductoInventario();

				producto.setIdProducto(rowSet.getString(1));
				producto.setNombre(rowSet.getString(2));
				producto.setMarca(rowSet.getString(3));
				producto.setCategoria(rowSet.getString(4));
				producto.setContenido(rowSet.getString(5));
				producto.setUnidades(rowSet.getInt(6));
				producto.setFechaVencimiento(rowSet.getString(7));
				producto.setPrecio(rowSet.getDouble(8));

				productos.add(producto);
			}

			rowSet.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
		return productos;
	}
	
	public static ArrayList<Proveedor> consultaProveedores() {

		ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
		// connect to database books and query database
		try {
			// specify properties of JdbcRowSet
			JdbcRowSet rowSet = new JdbcRowSetImpl();
			rowSet.setUrl(DATABASE_URL); // set database URL
			rowSet.setUsername(USERNAME); // set username
			rowSet.setPassword(PASSWORD); // set password
			System.out.println("--------------------------------------------------");
			rowSet.setCommand("SELECT * FROM Proveedor"); // set query
			rowSet.execute(); // execute query

			ResultSetMetaData metaData = rowSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			while (rowSet.next()) {
				Proveedor persona = new Proveedor();
				persona.setIdProveedor(rowSet.getString(1));
				persona.setNombre(rowSet.getString(2));
				persona.setTelefono(rowSet.getString(3));
				persona.setDireccion(rowSet.getString(4));
				persona.setCorreo(rowSet.getString(5));
				proveedores.add(persona);
			}
			
			rowSet.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
		return proveedores;
	}
}