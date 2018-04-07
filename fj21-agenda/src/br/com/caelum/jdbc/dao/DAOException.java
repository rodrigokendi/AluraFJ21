package br.com.caelum.jdbc.dao;


public class DAOException extends RuntimeException {

	public DAOException(){
		super("Nao foram retornados registros");
		
	}
	
}
