package br.com.caelum.agenda.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogic implements Logica{
	

	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getList();
		req.setAttribute("listaContatos", contatos);
		
		
		return "lista-contatos.jsp";
		
	
	}
}
