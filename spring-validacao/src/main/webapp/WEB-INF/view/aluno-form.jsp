<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário de cadastro de Alunos</title>
</head>
<body>

<h1>Cadastro de Alunos</h1>
<form:form action="${pageContext.request.contextPath}/alunos/salve" method="post" modelAttribute="aluno" acceptCharset="UTF-8">
Nome:<form:input path="nome"/><form:errors path="nome"/><br><br>
Matrícula:<form:input path="matricula"/><form:errors path="matricula"/><br><br>
Data:<form:input path="dataNascimento"/><form:errors path="dataNascimento"/><br><br>
Código do curso:<form:input path="curso" /><form:errors path="curso"/><br><br>
CRE:<form:input path="cre" /><form:errors path="cre"/><br><br>

<input type="submit" value="Salvar">


</form:form>


</body>
</html>