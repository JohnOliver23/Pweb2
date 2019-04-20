<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring demo</title>
</head>
<body>

<h2>Cadastro realizado com sucesso</h2>

<h3>Dados do aluno</h3>

<ul>
<li> ${aluno.nome }</li>
<li> ${aluno.matricula }</li>
<li> ${aluno.login }</li>
<li> ${aluno.pais }</li>
<li> ${aluno.linguagem }</li>
<li>Fluência: </li>
		<ul>
		<c:forEach  items="${aluno.fluencia }" var="lin">
			<li><c:out value="${lin}" /></li>
		</c:forEach>
	</ul>
</ul>

</body>
</html>