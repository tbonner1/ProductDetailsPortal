<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valid Product</title>
</head>
<body>
<%= session.getAttribute("name") %> has been registered to product. ID: <%= session.getAttribute("id") %> Description: <%= session.getAttribute("description") %>
</body>
</html>