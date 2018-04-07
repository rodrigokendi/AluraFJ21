package br.com.caelum.agenda.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class AdicionaContatoLogic implements Logica {
	

	public String executa(HttpServletRequest requisicao, HttpServletResponse response) {
		
		Contato contato = new Contato();
		
		contato.setNome(requisicao.getParameter("nome"));
		contato.setEmail(requisicao.getParameter("email"));
		contato.setEndereco(requisicao.getParameter("endereco"));
		Calendar dataNascimento = null;
	

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(requisicao.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			contato.setDataNascimento(dataNascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		return "contato-adicionado.jsp"; 
		
		
	}
}
