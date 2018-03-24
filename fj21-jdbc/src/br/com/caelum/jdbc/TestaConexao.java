package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			contato.setNome("Rodrigo 4");
			contato.setEmail("rodrigo@rodrigo.com.br");
			contato.setEndereco("Rua 4, 200");

			Calendar calendario = Calendar.getInstance();
			calendario.set(1990, Calendar.MAY, 28);

			contato.setDataNascimento(calendario);

			ContatoDAO contatoDao = new ContatoDAO();
			contatoDao.adiciona(contato);
			contatoDao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
