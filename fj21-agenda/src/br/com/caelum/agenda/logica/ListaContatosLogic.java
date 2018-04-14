package br.com.caelum.agenda.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogic implements Logica{
	

	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		Connection conexao =  (Connection) req.getAttribute("conexao");
		
		ContatoDAO dao = new ContatoDAO(conexao);
		List<Contato> contatos = dao.getList();
		req.setAttribute("listaContatos", contatos);
		
		
		return "/WEB-INF/jsp/lista-contatos.jsp";
		//return "display.jsp";

		
	
	}
}
