package br.com.caelum.tarefas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
@RequestMapping("tarefa")
public class TarefaController {

	@RequestMapping("/formularioTarefa")
	public String formulario() {
		return "tarefa/formulario-tarefa";

	}

	@RequestMapping("/adicionaTarefa")
	public String adicionaTarefa(@Valid Tarefa tarefa, BindingResult result) {

		if (result.hasFieldErrors()) {
			return "tarefa/formulario-tarefa";

		}

		JdbcTarefaDao tarefaDao = new JdbcTarefaDao();
		tarefaDao.adiciona(tarefa);

		return "tarefa/tarefa-adicionada";

	}

	@RequestMapping("/lista")
	public String lista(Model model) {
		JdbcTarefaDao tarefaDao = new JdbcTarefaDao();
		List<Tarefa> listaTarefa = tarefaDao.lista();
		model.addAttribute("lista", listaTarefa);

		return "tarefa/lista-tarefa";

	}
}