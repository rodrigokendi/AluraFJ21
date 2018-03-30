package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDAO {

	private Connection conexao;

	public FuncionarioDAO() {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionarios (nome,usuario,senha) values(?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());

			int result = stmt.executeUpdate();

			if (result > 0) {
				System.out.println("Funcionario inserido com sucesso");
			} else {
				System.out.println("Erro na insercao do funcionario");
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Funcionario> busca(Funcionario funcionario) {
		String sql = "select * from funcionarios";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Funcionario> funcionarios = new ArrayList<>();

			while (rs.next()) {
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String usuario = rs.getString("usuario");
				String senha = rs.getString("senha");

				Funcionario funcionarioLista = new Funcionario();

				funcionarioLista.setId(id);
				funcionarioLista.setNome(nome);
				funcionarioLista.setUsuario(usuario);
				funcionarioLista.setSenha(senha);

				funcionarios.add(funcionarioLista);

			}

			return funcionarios;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new RuntimeException(e);
			throw new DAOException();
		}

	}

	public void pesquisaPorId(int id) {
		String sql = "select * from funcionarios where id = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (!rs.next()) {
				System.out.println("Não há registro!");
			} else {

				long id1 = rs.getLong("id");
				String nome = rs.getString("nome");
				String usuario = rs.getString("usuario");
				String senha = rs.getString("senha");

				Funcionario funcionario = new Funcionario();

				funcionario.setId(id1);
				funcionario.setNome(nome);
				funcionario.setUsuario(usuario);
				funcionario.setSenha(senha);

				funcionario.imprime();

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public List<Funcionario> pesquisaPorNome(String nomes) {
		String sql = "select * from funcionarios where nome like ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, "%" + nomes + "%");
			ResultSet rs = stmt.executeQuery();
			List<Funcionario> funcionarios = new ArrayList<>();

			while (rs.next()) {
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String usuario = rs.getString("usuario");
				String senha = rs.getString("senha");

				Funcionario funcionarioLista = new Funcionario();

				funcionarioLista.setId(id);
				funcionarioLista.setNome(nome);
				funcionarioLista.setUsuario(usuario);
				funcionarioLista.setSenha(senha);

				funcionarios.add(funcionarioLista);

			}
			return funcionarios;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new RuntimeException(e);
			throw new DAOException();
		}

	}

	public void altera(Funcionario funcionario) {
		String sql = "update funcionarios set nome = ? , usuario = ?, senha = ? where id = ?";

		try {

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setLong(4, funcionario.getId());

			int result = stmt.executeUpdate();

			if (result > 0) {
				System.out.println("Alteração de dados com sucesso!");
				funcionario.imprime();
			} else {
				System.out.println("Houve algum erro na atualização de seus dados");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public void remove(Funcionario funcionario) {
		String sql = "delete from funcionarios where id = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setLong(1, funcionario.getId());

			int result = stmt.executeUpdate();

			if (result > 0) {
				System.out.println("Registro removido com sucesso");
			} else {
				System.out.println("Nenhum registro foi removido");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void close() throws SQLException {
		conexao.close();
	}

}
