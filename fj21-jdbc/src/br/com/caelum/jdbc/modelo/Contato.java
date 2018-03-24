package br.com.caelum.jdbc.modelo;


import java.util.Calendar;

public class Contato {

	private long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

	public long getId() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString() {

		return "id:" + id + "\n" + "nome: " + nome + "\n" + "ëmail: " + email + "\n" + "endereco: " + endereco + "\n"
				+ "data de nascimento: " + dataNascimento.getTime();

	}

}
