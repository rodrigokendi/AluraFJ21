package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
<<<<<<< HEAD
public class OlaMundoServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
		 throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		
		out.println("<html><head><title>Ola Mundo</title></head><body><h1>");
		out.println("Olá Mundo Servlet");
		out.println("</h1></body></html>");
=======
public class OlaMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h1>");
		pw.println("Ola Mundo Servlet");
		pw.println("</h1></body></html>");
>>>>>>> e59bca6f2c29d352c8fd9d9fb49ad843f6715dd6
	}

}
