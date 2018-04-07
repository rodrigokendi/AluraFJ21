<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de contatos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h1>Lista de contatos</h1>

	<jsp:useBean id="dao" class="br.com.caelum.jdbc.dao.ContatoDAO" />


	<table class="table">
		<thead>
			<tr bgcolor="#e5dcdc" >
				<th>ID</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Endereco</th>
				<th>Data Nascimento</th>
			</tr>
		</thead>
		<tbody>
		<jstl:forEach var="contato" items="${dao.list}">
			<tr bgcolor="#${contato.id % 2 == 0 ? 'e5dcdc' : 'ffffff' }" >
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time }" pattern="dd/MM/yyyy" /></td>
			</tr>
		</jstl:forEach>
		</tbody>
	</table>

</body>
</html>