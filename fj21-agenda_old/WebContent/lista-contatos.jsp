<%@page import="br.com.caelum.jdbc.dao.ContatoDAO"%>
<%@page import="br.com.caelum.jdbc.modelo.Contato"%>
<%@page import="java.util.*" %>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Lista Contatos</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	</head>
	<body>
	<jsp:useBean id="contatos" class="br.com.caelum.jdbc.dao.ContatoDAO"/>
	
	<main class="container">
		<h1>Lista de contatos: </h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Endereco</th>
					<th>Data Nascimento</th>
				</tr>
			</thead>
			<tbody>
				<jstl:forEach var="contato" items="${ contatos.list }"> 
				<tr>
					<td>${ contato.id }</td>
					<td>${ contato.nome }</td>
					<td>${ contato.email }</td>
					<td>${ contato.endereco }</td>
					<td><fmt:formatDate value="${ contato.dataNascimento.time }" pattern="dd/MM/yyyy"/> </td>
				</tr>
				</jstl:forEach>
			</tbody>
		</table>
	</main>
	</body>
</html>