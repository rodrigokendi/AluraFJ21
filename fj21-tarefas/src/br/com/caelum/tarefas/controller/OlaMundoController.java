package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/OlaMundo")
	public String OlaMundo(){
		return "OlaMundo";
	}
	
}
