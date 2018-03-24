package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDAO {

	private Connection conexao;

	public ContatoDAO() {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contato contato) {
		String sql = "insert into contatos (nome,email,endereco,dataNascimento) values(?,?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			int result = stmt.executeUpdate();

			if (result > 0) {
				System.out.println("Contato inserido com sucesso");
			} else {
				System.out.println("Erro na insercao do contato");
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void close() throws SQLException {
		conexao.close();
	}

}
