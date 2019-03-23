<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Query</h1>
<%
	String error_message = "";
	Object error = request.getAttribute("error");
	if (error != null) error_message = error.toString();
%>
<form action="QueryServlet">
<table cellspacing="4">
	<tr>
		<td>Enter author ID:</td>
		<td><input name="authorID" type="text" size="20"></td>
		<td style="color: red"><%= error_message %></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Query"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>