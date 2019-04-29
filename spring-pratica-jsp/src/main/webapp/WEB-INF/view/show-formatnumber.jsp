<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Objetos pré-definidos do JSP</title>
</head>
<body>
<h1>uso da tag forEach:</h1>
<h3>Números:</h3>
<ul>
<c:forEach var="num" items="${numeros}">
	<c:if test="${num %2 == 0 }">
		<li><fmt:formatNumber value="${num}" pattern="00.00"/></li>
	</c:if>
</c:forEach>
</ul>

</body>
</html>