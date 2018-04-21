<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/resources/css/bootstrap.css">
		<link rel="stylesheet" href="/resources/css/jquery-ui.css">
		<link type="text/css"	href="/resources/css/tarefas.css"	rel="stylesheet"	/>
		
		<title>Gerenciador de Tarefas</title>
	</head>
	<body>
		<form action="modificarTarefa" method="post">
			<h3>Editando a tarefa</h3>
			<input name="id" type="hidden" value="${tarefa.id}" />			
			Descrição:<br/>
			<textarea name="descricao" rows="5" cols="100">${tarefa.descricao}</textarea><br/>
			Finalizada
			<input name="finalizado" type="checkbox" id="checkbox1" value="true" ${tarefa.finalizado ? "checked" : "" } /><br/>
			Data de Conclusão:
			<input name="dataFinalizacao" id="dataFinalizacao" type="text" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>"><br/>
			
			<script src="/resources/js/jquery.js"></script>
			<script src="/resources/js/jquery-ui.js" type="text/javascript"></script>
			
			<script type="text/javascript">
				$("#dataFinalizacao").datepicker({dateFormat: 'dd/mm/yy', changeYear: true})
			</script>
			
			<script type="text/javascript">
			$("#checkbox1").click(function () {
			    if ($(this).attr("checked") == false) {
			        $("#dataFinalizacao").val("")
			        document.getElementById('dataFinalizacao').disabled = true;
			    }
			});
			</script>
			<p><input type="submit" value="Salvar" />			
		</form>
		
	</body>
</html>