<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página principal da aplicação</title>
</head>
<body>

<h1>Cadastro de livros</h1>
<form:form action="save" method="post" modelAttribute="livro" acceptCharset="UTF-8">
Id:<form:input path="id"/><br><br>
Título:<form:input path="titulo"/><br><br>
Autor:<form:input path="autor"/><br><br>
Estilo:<form:select path="estilo" items="${estiloOptions }"/><br><br>
<input type="submit" value="Salvar">


</form:form>


</body>
</html>