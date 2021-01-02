<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome <%= session.getAttribute("sessname") %></title>
</head>
<body>
	Welcome <%= session.getAttribute("sessname") %>. Please log-out below.
	<br><br>
	<a href="LogoutServlet">Logout</a>
</body>
</html>