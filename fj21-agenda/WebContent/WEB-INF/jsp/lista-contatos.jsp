<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda FJ-21</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<display:table name="listaContatos" export="false" id="contatos" >
		<display:column title="Nome" property="nome" />
		<c:if test="${not empty contatos.email}">
  			<display:column title="E-mail" property="email" autolink="true"/>
		</c:if> <c:if test="${empty contatos.email}">
		 	 <display:column title="E-mail" value="E-mail n�o informado" />
		 </c:if>
            <display:column title="Endere�o" property="endereco" />  
            <fmt:formatDate value="${contatos.dataNascimento.time}" pattern="dd/MM/yyyy" var="dataFormatada"/>  
            <display:column title="Data de nascimento" value="${dataFormatada}" />
            <display:column title ="A��es" value="Remover" href="super?logica=RemoveContatoLogic" paramId="id" paramProperty="id"/>
          	<display:column title ="" value="Alterar" href="super?logica=FormAlteraLogic" paramId="id" paramProperty="id"/>
	</display:table>
	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>
</html>