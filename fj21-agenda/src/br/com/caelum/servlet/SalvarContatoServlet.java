package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/adicionaContato")
public class SalvarContatoServlet extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter out = resp.getWriter();

			// recebe parametro do request
			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			String endereco = req.getParameter("endereco");
			String dataNascimento = req.getParameter("dataNascimento");

			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(format.parse(dataNascimento));
			// cria objeto contato
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setEndereco(endereco);
			contato.setDataNascimento(calendario);

			// salva contato
			ContatoDao dao = new ContatoDao();
			dao.adiciona(contato);

			out.println("<html><body><h1>");
			out.println("Contato " + contato.getNome() + " adicionado com sucesso");
			out.println("</h1></body></html>");
			
			

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}

	}

}
