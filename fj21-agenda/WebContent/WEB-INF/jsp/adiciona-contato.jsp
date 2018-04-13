<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário cadastro de contatos</title>
<link  rel="stylesheet" href="assets/css/jquery.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<script src="assets/js/jquery.js"></script>
<script src="assets/js/jquery-ui.js"></script>
</head>
<body>
	<br />
	<c:import url="cabecalho.jsp" />
	<h3>Formulário cadastro de contatos</h3>	
	<form action="/fj21-agenda/super?logica=AdicionaContatoLogic" method="post">
	
		Nome:<br> 
		<input type="text" name="nome" /><br /> 
		E-mail:<br> 
		<input type="email" name="email" /><br /> 
		Endereco:<br> 
		<input type="text" name="endereco" /><br /> 
		Data de Nascimento:<br>
		<tags:datas data="dataNascimento"/>
		<br>
		<button>Salvar</button>
	
	<c:import url="rodape.jsp" />	
	</form>	
</body>
</html>