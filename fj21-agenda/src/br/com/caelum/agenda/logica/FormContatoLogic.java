package br.com.caelum.agenda.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormContatoLogic implements Logica{
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {

		return "adiciona-contato.jsp";
	}

	
}
