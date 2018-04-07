package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class ContadorServlet extends HttpServlet {

	private int contador = 0;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("Iniciando o servlet");
	}

	@Override
	public void destroy() {
		super.destroy();
		log("Finalizando o servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		contador++;
		PrintWriter out = resp.getWriter();

		out.println("<html><body><h1>");
		out.println("Valor atual do contador: " + contador);
		out.println("</h1></body></html>");

	}

}
