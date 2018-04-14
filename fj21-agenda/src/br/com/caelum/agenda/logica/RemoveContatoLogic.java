package br.com.caelum.agenda.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica{
	@Override
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		Connection conexao = (Connection) req.getAttribute("conexao");
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDAO dao = new ContatoDAO(conexao);
		dao.remove(contato);
		
		
		System.out.println("Excluindo contato...");
		
		return "super?logica=ListaContatosLogic";
	}
 
}
