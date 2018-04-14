<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<h1>Cadastro de Tarefas</h1>



<form action="adicionaTarefa" method="post">
Descricao:
<br>
<textarea name="descricao" rows="5" cols="100"></textarea><br	/>
<form:errors path="tarefa.descricao" cssStyle="color:red"/>
<br>
Finalizado:
<br>
<input type="checkbox" name="finalizado">
<br>
<br>
<button>Cadastrar</button>


</form>

</body>
</html>