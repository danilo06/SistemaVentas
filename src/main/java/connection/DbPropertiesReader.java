package connection;

import java.util.MissingResourceException;
import java.util.Properties;
/**
 * Esta clase permite la conexion de de la base de datos
 * @author Jose Buitrago, Danilo Beleno
 *
 */
public class DbPropertiesReader {
	
	private static final String BUNDLE_NAME = "connection.properties";

	private static final Properties RESOURCE_BUNDLE = PropertyLoader.loadProperties(BUNDLE_NAME);

	private DbPropertiesReader() {
	}
	/**
	 * 
	 * @param key, conexion
	 * @return conxion realizada
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getProperty(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
