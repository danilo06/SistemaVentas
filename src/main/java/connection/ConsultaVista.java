package connection;

// Fig. 28.29: JdbcRowSetTest.java
// Displaying the contents of the authors table using JdbcRowSet.
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl; // Sun's JdbcRowSet implementation

public class ConsultaVista {
	// JDBC driver name and database URL
	static final String DATABASE_URL = DbPropertiesReader.getString("db.url");
	static final String USERNAME = DbPropertiesReader.getString("db.user");
	static final String PASSWORD = DbPropertiesReader.getString("db.password");


	public static void main(String args[]) {
		autenticar("danilo06","root");
	}
	
	public static void autenticar(String usuario, String contrasena) {
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

			ResultSetMetaData metaData = rowSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();

			for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			System.out.println();

			while (rowSet.next()) {
				for (int i = 1; i <= numberOfColumns; i++)
					System.out.printf("%-8s\t", rowSet.getObject(i));
				System.out.println();
			}

			rowSet.close();
		} 
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	} 
} 