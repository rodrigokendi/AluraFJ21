<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<link rel="stylesheet" href="/assets/css/screen.css" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario Tarefa</title>
</head>
<body>
<h1>Alterar Tarefa</h1>

<form action="altera" method="post" >
Descricao:
<br>
<textarea name="descricao"  rows="5" cols="100" >${tarefa.descricao}</textarea><br	/>
<form:errors path="tarefa.descricao" cssStyle="color:red"/>
<br>
Finalizado:
<br>
<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado ? 'checked' : '' }/> <br />
<br>
Data Finalizacao:
<br>
<input type="text" name="dataFinalizacao"
value="<fmt:formatDate
value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />"/>
<br />
<input type="hidden" name="id" value="${tarefa.id}">
<button>Alterar</button>
</form>

</body>
</html>