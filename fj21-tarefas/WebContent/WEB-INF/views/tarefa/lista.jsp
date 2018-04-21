<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/resources/css/bootstrap.css">
		<link	type="text/css"	href="/resources/css/tarefas.css"	rel="stylesheet"	/>
		<title>Agenda de Tarefas</title>
	</head>
	<body>
	<h2>Agenda de Tarefas</h2>
	<hr>	<!-- 	<main class="container"> -->
	
		<a href="novaTarefa">Nova Tarefa </a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>DESCRIÇÃO</th>
					<th>STATUS</th>
					<th>DATA FINALIZAÇÃO</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tarefa" items="${tarefas}">
					<tr>
						<td>${tarefa.id}</td>
						<td>${tarefa.descricao}</td>
						<td id="tarefaStatus-${tarefa.id}">
							<c:if test="${tarefa.finalizado eq true}">Finalizada</c:if>
							
							  <c:if test="${tarefa.finalizado eq false}">
							   <a	href="#"	onClick="finalizaAgora(${tarefa.id})">
								 Finaliza	agora!</a>
							  </c:if>
						</td>
						<td id="tarefaData-${tarefa.id}">
				  		<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>
				  		</td>
						<td><a href="exibeTarefa?id=${tarefa.id}">Modificar</a></td>
						<td>
							<form action="excluirTarefa" method="post">
								<input name="id" type="hidden" value="${tarefa.id}" />
								<input type="submit" value="Excluir" />
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<script src="/resources/js/jquery.js"></script>
		<script>
		function finalizaAgora(id){
			$.post("finalizar", {'id' : id}, function(){
				$('#tarefaStatus-' + id).html('Finalizada')
				$('#tarefaData-' +id).html(new Date().toLocaleDateString('en-GB'))
				
			});
			
		}
		</script>
	</body>
</html>