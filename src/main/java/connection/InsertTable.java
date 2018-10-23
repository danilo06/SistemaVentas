package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertTable {
	private static final String URL = DbPropertiesReader.getString("db.url");
	static final String USERNAME = DbPropertiesReader.getString("db.user");
	static final String PASSWORD = DbPropertiesReader.getString("db.password");
	
	private Connection connection = null; // manages connection
	private PreparedStatement insertNewProductoInventario = null;
	private PreparedStatement insertNewsalariedEmployee = null;
	private PreparedStatement insertNewcommissionEmployee = null;
	private PreparedStatement insertNewbasePlusCommissionEmployee = null;
	private PreparedStatement insertNewhourlyEmployee = null;
	
	public InsertTable() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			insertNewProductoInventario = connection.prepareStatement(
					"INSERT INTO Inventario " + "(ID_Producto, Nombre, Marca, Categoria, Contenido_neto, Unidades, Fecha_vencimiento, Precio) " + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
			//******************************************
			insertNewsalariedEmployee = connection.prepareStatement(
					"INSERT INTO salariedEmployee " + "(socialsecurityNumber, weeklySalary, bonus) " + "VALUES ( ?, ?, ?)");
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
	public int addSalariedEmployee(String socialNumber, float weeklySalary , float bonus) {
		int result = 0;
		try {
			insertNewsalariedEmployee.setString(1, socialNumber);
			insertNewsalariedEmployee.setFloat(2, weeklySalary);
			insertNewsalariedEmployee.setFloat(3, bonus);
			
			result = insertNewsalariedEmployee.executeUpdate();
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
		return result;
	}
	public int addCommissionEmployee(String socialNumber, int grossSales, float commissionRate, float bonus) {
		int result = 0;
		try {
			insertNewcommissionEmployee.setString(1, socialNumber);
			insertNewcommissionEmployee.setInt(2, grossSales);
			insertNewcommissionEmployee.setFloat(3, commissionRate);
			insertNewcommissionEmployee.setFloat(4, bonus);
			result = insertNewcommissionEmployee.executeUpdate();
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
		return result;
	}

	public int addBasePlusCommissionEmployee(String socialNumber,int grossSales, float commissionRate, float baseSalary, float bonus) {
		int result = 0;
		try {
			insertNewbasePlusCommissionEmployee.setString(1, socialNumber);
			insertNewbasePlusCommissionEmployee.setInt(2, grossSales);
			insertNewbasePlusCommissionEmployee.setFloat(3, commissionRate);
			insertNewbasePlusCommissionEmployee.setFloat(4, baseSalary);
			insertNewbasePlusCommissionEmployee.setFloat(5, bonus);
			result = insertNewbasePlusCommissionEmployee.executeUpdate();
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			close();
		}
		return result;
	}
	
	
	public void close() {
		try {
			connection.close();
		} // end try
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} 
	} 
}

