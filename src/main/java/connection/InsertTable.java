package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * Esta clase permite la insercion de nuevos datos, como lo es producto a inventario y proveedor
 * @author Danilo Beleño, Sebastian Suarez, Jose Buitrago, Andres Barragan
 *@version 15/11/2018
 */

public class InsertTable {
	private static final String URL = DbPropertiesReader.getString("db.url");
	static final String USERNAME = DbPropertiesReader.getString("db.user");
	static final String PASSWORD = DbPropertiesReader.getString("db.password");
	// Declaracion de los atributos privados
	private Connection connection = null; // manages connection
	private PreparedStatement insertNewProductoInventario = null;
	private PreparedStatement insertNewsProveedor = null;
	private PreparedStatement insertNewcommissionEmployee = null;
	private PreparedStatement insertNewbasePlusCommissionEmployee = null;
	private PreparedStatement insertNewhourlyEmployee = null;
	/**
	 * Incersion de datos a las respectivas tablas
	 */
	public InsertTable() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			insertNewProductoInventario = connection.prepareStatement(
					"INSERT INTO Inventario " + "(ID_Producto, Nombre, Marca, Categoria, Contenido_neto, Unidades, Fecha_vencimiento, Precio) " + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
			//******************************************
			insertNewsProveedor = connection.prepareStatement(
					"INSERT INTO Proveedor " + "(ID_proveedor, nombre_empresa, telefono, Direccion, Correo) " + "VALUES ( ?, ?, ?, ?, ?)");
			//******************************************
			insertNewcommissionEmployee = connection.prepareStatement(
					"INSERT INTO commissionEmployee " + "(socialsecurityNumber, grossSales, commissionRate, bonus) " + "VALUES ( ?, ?, ?, ?)");
			//******************************************
			insertNewbasePlusCommissionEmployee = connection.prepareStatement(
					"INSERT INTO basePlusCommissionEmployee " + "(socialsecurityNumber, grossSales, commissionRate, baseSalary, bonus) " + "VALUES ( ?, ?, ?, ?, ?)");
			//******************************************
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		} // end catch
	} // end PersonQueries constructor
	/**
	 * 
	 * @param idProducto
	 * @param nombre
	 * @param marca
	 * @param categoria
	 * @param contenido
	 * @param unidades
	 * @param fechaVencimiento
	 * @param precio
	 * @return resultado de la incersion
	 */
	public int addProductoInventario(String idProducto, String nombre, String marca, String categoria, String contenido, int unidades, String fechaVencimiento, Double precio ) {
		int result = 0;
		try {
			insertNewProductoInventario.setString(1, idProducto);
			insertNewProductoInventario.setString(2, nombre);
			insertNewProductoInventario.setString(3, marca);
			insertNewProductoInventario.setString(4, categoria);
			insertNewProductoInventario.setString(5,contenido);
			insertNewProductoInventario.setInt(6, unidades);
			insertNewProductoInventario.setString(7, fechaVencimiento);
			insertNewProductoInventario.setDouble(8, precio);

			result = insertNewProductoInventario.executeUpdate();
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
		return result;
	}
	/**
	 * 
	 * @param idProveedor
	 * @param nombre_empresa
	 * @param telefono
	 * @param direccion
	 * @param correo
	 * @return ingreso de un nuevo proveedor
	 */
	public int addProveedor(String idProveedor, String nombre_empresa , String telefono, String direccion, String correo) {
		int result = 0;
		try {
			insertNewsProveedor.setString(1, idProveedor);
			insertNewsProveedor.setString(2, nombre_empresa);
			insertNewsProveedor.setString(3, telefono);
			insertNewsProveedor.setString(4, direccion);
			insertNewsProveedor.setString(5, correo);
			
			
			result = insertNewsProveedor.executeUpdate();
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
		return result;
	}
	
	/**
	 * Cierre de la conexion
	 */
	public void close() {
		try {
			connection.close();
		} // end try
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} 
	} 
}

