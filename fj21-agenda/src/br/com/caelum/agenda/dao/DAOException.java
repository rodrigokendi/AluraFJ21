package br.com.caelum.agenda.dao;


public class DAOException extends RuntimeException {

	public DAOException(){
		super("Nao foram retornados registros");
		
	}
	
}
