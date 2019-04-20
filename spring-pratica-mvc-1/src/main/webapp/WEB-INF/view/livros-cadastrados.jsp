<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página principal da aplicação</title>
</head>
<body>

<h1>Livros cadastrados</h1>

<c:if test="${not empty livro}">
	<p>${livro.titulo } cadastrado com sucesso</p>
</c:if>

<ul>
<c:forEach var="livroItem" items="${livros}">
	<li>${livroItem.titulo }</li>
</c:forEach>
</ul>

</body>
</html>