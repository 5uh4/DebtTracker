package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {
	/**
	 * Le proporcionamos aqui la informacion necesaria para realizar la conexion a
	 * la base de datos.
	 */
	final String DB_URL = "jdbc:mysql://localhost/hbo";
	final String USER = "root";
	final String PASS = "1234";
	protected Connection conn;
	protected Statement stmt;

	/**
	 * Metodo que lleva a cabo la conexion a la base de datos.
	 */
	public AbstractDAO() {
		try {
			this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
			this.stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
