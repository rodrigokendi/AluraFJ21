package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaContato {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();

			/*
			 * altera *
			 * contato.setId((long) 5); 
			 * contato.setNome("Teste 1");
			 * contato.setEmail("teste@rodrigo.com.br"); 
			 * contato.setEndereco("Rua 1, 200");
			 * 
			 * Calendar calendario = Calendar.getInstance(); calendario.set(1993,
			 * Calendar.MAY, 28);
			 * 
			 * contato.setDataNascimento(calendario);
			 * 
			 * ContatoDAO contatoDao = new ContatoDAO(); 
			 * contatoDao.altera(contato)
			 */

			/*
			 * remove 
			 * contato.setId((long) 5); 
			 * ContatoDAO contatoDao = new ContatoDAO();
			 * contatoDao.remove(contato);
			 */
			
			/*adiciona
			 * contato.setNome("Teste 1");
			 * contato.setEmail("teste@rodrigo.com.br"); 
			 * contato.setEndereco("Rua 1, 200");
			 * 
			 * Calendar calendario = Calendar.getInstance(); calendario.set(1993,
			 * Calendar.MAY, 28);
			 * 
			 * contato.setDataNascimento(calendario);
			 * 
			 * ContatoDAO contatoDao = new ContatoDAO(); 
			 * contatoDao.adiciona(contato)
			 */
			
			// contatoDao.pesquisaPorId(4);

			ContatoDAO contatoDao = new ContatoDAO();
			//List<Contato> contatos = contatoDao.pesquisaPorNome("Teste");
			List<Contato> contatos = contatoDao.busca(contato);
			contato.imprimeLista(contatos);
		

			contatoDao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
