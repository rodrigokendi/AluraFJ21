package br.com.caelum.jdbc.dao;

import br.com.caelum.jdbc.modelo.Contato;

public class DAOException extends RuntimeException {

	public DAOException(){
		super("Nao foram retornados registros");
		
	}
	
}
