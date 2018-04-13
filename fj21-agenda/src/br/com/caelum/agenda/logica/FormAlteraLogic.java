package br.com.caelum.agenda.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class FormAlteraLogic implements Logica {
	 
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {

	    long id = Long.parseLong(req.getParameter("id"));
	    
	    Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDAO dao = new ContatoDAO();
		contato = dao.pesquisaPorId(id);
		req.setAttribute("Contato", contato);

	
		return "/WEB-INF/jsp/alteracontato.jsp";
	}
	

}
