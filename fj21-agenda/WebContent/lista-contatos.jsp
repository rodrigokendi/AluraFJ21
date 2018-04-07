<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
			<c:forEach var="contato" items="${listaContatos}">
				<tr bgcolor="#${contato.id % 2 == 0 ? 'e5dcdc' : 'ffffff' }">
					<td>${contato.id}</td>
					<td>${contato.nome}</td>
					<td>
					<c:if test="${not empty contato.email}">
  						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if> <c:if test="${empty contato.email}">
		 	             E-mail não informado
		 	        </c:if>
		 	        </td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
					<td><a href="super?logica=RemoveContatoLogic&id="${contato.id}">Remover</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</main>
<c:import url="rodape.jsp" />
</html>