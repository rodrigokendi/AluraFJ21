<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem vindo</title>
</head>
<body>
<h1>Pagina inicial da Lista de Tarefas</h1>
<p>Bem vindo, ${usuarioLogado.login}</p>
<a href="tarefa/listaTarefas">Clique aqui</a> para acessar a lista de tarefas 
<br>
<a href="logout">Sair</a>
</body>
</html>