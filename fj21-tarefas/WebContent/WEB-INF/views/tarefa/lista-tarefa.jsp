<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/assets/css/jquery.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
<link rel="stylesheet" href="/assets/css/screen.css" type="text/css"/>
</head>
<body>
	<br >
	<c:import url="/WEB-INF/views/cabecalho.jsp" />
	<display:table style="font-size:1.1em;" name="lista" export="false" id="listaTarefa" >
		<display:column title="Descricao" property="descricao"/>
        <display:column title="Finalizada" property="finalizado" />  
        <fmt:formatDate value="${listaTarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" var="dataFormatada"/>  
        <display:column title="Data de finalizacao" value="${dataFormatada}" />
        <display:column title ="" value="Remover" href="/remove" paramId="id" paramProperty="id"/>
	</display:table>
	<hr >
	<c:import url="/WEB-INF/views/rodape.jsp" />
</body>
</html>