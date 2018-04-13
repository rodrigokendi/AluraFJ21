<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de contatos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<br />
	<c:import url="cabecalho.jsp" />
	
	<main class="container">
<form action="/fj21-agenda/super?logica=AlteraContatoLogic" method="post">
	<table class="table">
		<thead>
		   <th style="font-size: 30px">Lista de contatos</th> 
			<tr bgcolor="#e5dcdc">
				<th>ID</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Endereco</th>
				<th>Data Nascimento</th>
			</tr>
		</thead>
		<tbody>
				<tr bgcolor="#${contato.id % 2 == 0 ? 'e5dcdc' : 'ffffff' }">
					<td><input type="hidden" name="id" value="${Contato.id}"></td>
					<td><input type="text" name="nome" value="${Contato.nome}" /></td>					
					<td><input type="email" name="email" value="${Contato.email}" /></td>
					<td><input type="text" name="endereco" value="${Contato.endereco}" /></td>
					<fmt:formatDate value="${Contato.dataNascimento.time}"  
                				type="date" 
                				pattern="dd/MM/yyyy"
                				var="theFormattedDate" />
					<td><input type="text" name ="dataNascimento" value="${theFormattedDate}"/></td>		
					<td><Button>Alterar</Button></td>			
				</tr>	
		</tbody>
	</table>
	</form>	
		
</body>
</main>
<c:import url="rodape.jsp" />
</html>