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
<h1>Uso da tag forEach</h1>
<h3>Números</h3>
<ul>
<c:forEach var="num" items="${numeros}">
	<c:if test="${num %2 == 0 }">
		<li>${num}</li>
	</c:if>
</c:forEach>
</ul>

</body>
</html>