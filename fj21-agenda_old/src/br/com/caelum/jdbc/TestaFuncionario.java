package br.com.caelum.jdbc;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		
		/*funcionario.setNome("Pedro");
		funcionario.setUsuario("pedro");
		funcionario.setSenha("1234R");*/
		
		FuncionarioDAO funcionarioDao = new FuncionarioDAO();
		//funcionarioDao.adiciona(funcionario);
		
		
		funcionario.setId((long) 2);
		funcionarioDao.remove(funcionario);

	}

}
