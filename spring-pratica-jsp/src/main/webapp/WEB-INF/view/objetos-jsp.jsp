<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Objetos pr�-definidos do JSP</title>
</head>
<body>
<h1>Algumas informa��es que os objetos jsp podem obter:</h1>
<ul>
<li>Um cabe�alho HTTP: ${header.accept }</li>
<li>Um par�metro passado por URL: ${param.nome }. </li>
<li>Path da webapp ${pageContext.request.contextPath }. </li>
</ul>
</body>
</html>