package br.com.caelum.agenda.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class FormContatoLogic implements Logica{
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
	
		

		return "/WEB-INF/jsp/adiciona-contato.jsp";
	}

	
}
