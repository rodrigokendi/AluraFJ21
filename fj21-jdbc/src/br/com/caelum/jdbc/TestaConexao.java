package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta!");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
