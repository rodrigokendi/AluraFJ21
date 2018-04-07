package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		try {
<<<<<<< HEAD:fj21-agenda/src/br/com/caelum/jdbc/ConnectionFactory.java
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			return DriverManager.getConnection("jdbc:mysql://localhost:3308/fj21", "root", "");
=======
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
>>>>>>> e59bca6f2c29d352c8fd9d9fb49ad843f6715dd6:fj21-jdbc/src/br/com/caelum/jdbc/ConnectionFactory.java
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
