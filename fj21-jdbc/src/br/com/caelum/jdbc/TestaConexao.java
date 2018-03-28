package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();

			
			  contato.setNome("Teste"); contato.setEmail("teste@rodrigo.com.br");
			  contato.setEndereco("Rua 1, 200");
			  
			  Calendar calendario = Calendar.getInstance(); calendario.set(1993,
			  Calendar.MAY, 28);
			  
			  contato.setDataNascimento(calendario);
			  
			  ContatoDAO contatoDao = new ContatoDAO(); contatoDao.adiciona(contato);
			 

			//ContatoDAO contatoDao = new ContatoDAO();
			//List<Contato> contatos = contatoDao.busca(contato);
			//Contato contact = contatoDao.pesquisaPorId(1);
			//contatoDao.pesquisaPorId(1);
		//	contato.setNome("rodrigo kendi");
			//contatoDao.altera(1);

			/*for (Contato contatoLista : contatos) {
				System.out.println("Nome: " + contatoLista.getNome());
				System.out.println("Email: " + contatoLista.getEmail());
				System.out.println("Endereço: " + contatoLista.getEndereco());
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				System.out.println(
						"Data de Nascimento: " + dateFormat.format(contatoLista.getDataNascimento().getTime()) + "\n");
			}*/

			contatoDao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
