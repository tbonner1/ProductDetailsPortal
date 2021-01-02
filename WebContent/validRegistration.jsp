<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valid Registration</title>
</head>
<body>
<%= session.getAttribute("sesname") %> has been registered to registration. 
<br>
Click Below to log-out.
<br>
<br>
<a href="LogoutServlet"> logout link</a>
</body>
</html>