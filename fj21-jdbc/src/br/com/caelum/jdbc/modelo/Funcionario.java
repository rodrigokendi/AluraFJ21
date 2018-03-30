package br.com.caelum.jdbc.modelo;

import java.util.List;

public class Funcionario {

	private Long id;
	private String nome;
	private String usuario;
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void imprime() {
		System.out.println("Nome: " + getNome());
		System.out.println("Usuario: " + getUsuario());
		System.out.println("Senha: " + getSenha());
	}

	public void imprimeLista(List<Funcionario> funcionarios) {

		for (Funcionario funcionarioLista : funcionarios) {
			System.out.println("Nome: " + funcionarioLista.getNome());
			System.out.println("Usuario: " + funcionarioLista.getUsuario());
			System.out.println("Senha: " + funcionarioLista.getSenha());
		}
	}

}
