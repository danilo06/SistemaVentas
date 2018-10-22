package connection;

// Fig. 28.29: JdbcRowSetTest.java
// Displaying the contents of the authors table using JdbcRowSet.
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl; // Sun's JdbcRowSet implementation

import Modelo.Empleado;

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
			rowSet.setCommand("SELECT * FROM Empleado where Usuario = '"+usuario+"'"); // set query
			rowSet.execute(); // execute query

			rowSet.next();
			//System.out.printf(rowSet.getString(10));
			System.err.println("USUARIO NO ENCONTRADO");
			if (contrasena.equals(rowSet.getString(10))) {
				empleado.setUsuario(rowSet.getString(9));
				empleado.setCargo(rowSet.getString(7));
			}
			rowSet.close();
		} 
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
		return empleado;
	} 
} 