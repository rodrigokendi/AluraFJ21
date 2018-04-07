package br.com.caelum.jdbc.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

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

	public void imprime() {
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("Endere�o: " + getEndereco());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Data de Nascimento: " + dateFormat.format(getDataNascimento().getTime()) + "\n");
	}

	public void imprimeLista(List<Contato> contato) {

		for (Contato contatoLista : contato) {
			System.out.println("Nome: " + contatoLista.getNome());
			System.out.println("Email: " + contatoLista.getEmail());
			System.out.println("Endere�o: " + contatoLista.getEndereco());
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println(
					"Data de Nascimento: " + dateFormat.format(contatoLista.getDataNascimento().getTime()) + "\n");
		}
	}

}
