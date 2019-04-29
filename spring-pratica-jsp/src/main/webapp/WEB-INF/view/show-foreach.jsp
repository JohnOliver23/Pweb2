<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Objetos pré-definidos do JSP</title>
</head>
<body>
<h1> Uso do forEach</h1>
<h3>Estados</h3>
<ul>

</ul>
<c:forEach var="estado" items="${estados}">
	<li>${estado}</li>
</c:forEach>

<table>
	<thead>
		<th>indices</th>
		<th>numeros</th>
	</thead>
	<tbody>
		<c:forEach var="num" items="${pares}">
			<tr>
				<td>numero</td>
				<td>${num }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>