package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

	public List<Contato> busca(Contato contato) {
		String sql = "select * from contatos";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Contato> contatos = new ArrayList<>();

			while (rs.next()) {
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String endereco = rs.getString("endereco");
				Date dataNascimento = rs.getDate("dataNascimento");

				Contato contatoLista = new Contato();

				contatoLista.setId(id);
				contatoLista.setNome(nome);
				contatoLista.setEmail(email);
				contatoLista.setEndereco(endereco);

				Calendar calendario = Calendar.getInstance();
				calendario.setTime(dataNascimento);

				contatoLista.setDataNascimento(calendario);

				contatos.add(contatoLista);

			}

			return contatos;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new RuntimeException(e);
			throw new DAOException();
		}

	}

	public void close() throws SQLException {
		conexao.close();
	}

}
