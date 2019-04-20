<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form aluno</title>
</head>
<body>
	<form:form action="cadastreAluno" method="post" modelAttribute="aluno">
		Nome: <form:input path="nome" /><br>
		Matricula: <form:input path="matricula" /><br>
		Login: <form:input path="login"/><br>
		
		Pais: <form:select path="pais">
				<form:option label="Brasil" value="Brasil"/>
				<form:option label="Argentina" value="Argentina"/>
				<form:option label="Col�mbia" value="Col�mbia"/>
				<form:option label="Uruguai" value="Uruguai"/>
			</form:select><br>
			
		Linguagem: <form:radiobutton path="linguagem" value="Java"/>Java
					<form:radiobutton path="linguagem" value="Phyton"/>Phyton
					<form:radiobutton path="linguagem" value="PHP"/>PHP <br>
		Flu�ncia:
				<form:checkbox path="fluencia" value="Portugu�s"/>Portugu�s
				<form:checkbox path="fluencia" value="Ingl�s"/>Ingl�s
				<form:checkbox path="fluencia" value="Espanhol"/>Espanhol<br>
		
		<input type="submit" value="salvar">
		
	</form:form>

</body>
</html>