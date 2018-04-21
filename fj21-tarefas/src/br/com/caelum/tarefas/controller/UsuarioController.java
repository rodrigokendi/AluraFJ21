package br.com.caelum.tarefas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.JdbcUsuarioDao;
import br.com.caelum.tarefas.modelo.Usuario;

@Controller
public class UsuarioController {
	
	private final JdbcUsuarioDao usuarioDao;
	
	@Autowired
	public UsuarioController(JdbcUsuarioDao usuarioDao){
		this.usuarioDao = usuarioDao;
	}

	@RequestMapping("login")
	public String loginForm() {
		return "usuarios/formularioLogin";

	}

	@RequestMapping("efetuarLogin")
	public String efetuarLogin(Usuario usuario, HttpSession session) {


		if (usuarioDao.existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		}

		return "redirect:login?erro=Login ou senha invalidos";

	}
	
	@RequestMapping("logout")
	public String logout( HttpSession session){
		session.invalidate();
		return "usuarios/formularioLogin";
	}

}
