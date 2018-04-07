package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

@WebServlet("/adicionacontato")
public class adicionaContatoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse response) 
			throws ServletException, IOException {

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
		
		//imprime o nome do contato na pagina
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>");
		out.println("Contato " + contato.getNome() + " adicionado com sucesso");
		out.println("</h1></body></html>");
		
		
		
	}
}
