package br.com.caelum.tarefas.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutenticadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String url = request.getRequestURI();
		if (url.endsWith("login") || url.endsWith("efetuarLogin") || url.contains("resources")) {
			return true;
		}

		if (request.getSession().getAttribute("usuarioLogado") !=null) {
			return true;
		}

		response.sendRedirect("login");
		return false;
	}

}
