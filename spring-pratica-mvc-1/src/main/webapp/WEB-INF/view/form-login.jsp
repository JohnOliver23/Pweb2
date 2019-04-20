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
<h1>Autentique-se</h1>
<c:if test="${not empty erro }">
	<span style="color:red">${erro}</span>
</c:if>
<form action="valide" method="post">
Login: <input type="text" name="login"><br>
Senha: <input type="password" name="senha"><br>
<input type="submit" value="login">
</form>


</body>
</html>