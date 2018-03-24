package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			/*
			 * contato.setNome("Rodrigo 4");
			 * contato.setEmail("rodrigo@rodrigo.com.br");
			 * contato.setEndereco("Rua 4, 200");
			 * 
			 * Calendar calendario = Calendar.getInstance();
			 * calendario.set(1990, Calendar.MAY, 28);
			 * 
			 * contato.setDataNascimento(calendario);
			 * 
			 * ContatoDAO contatoDao = new ContatoDAO();
			 * contatoDao.adiciona(contato);
			 */

			ContatoDAO contatoDao = new ContatoDAO();
			List<Contato> contatos = contatoDao.busca(contato);

			for (Contato contatoLista : contatos) {
				System.out.println(contatoLista);
			}

			contatoDao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
