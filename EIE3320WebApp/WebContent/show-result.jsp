<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Show Result</h1>
<%
	String person = "YANG Tianyu";
	String id = "?";
	Object authorID = request.getAttribute("authorID");
	if (authorID != null)
		id = authorID.toString();
	Object fullname = request.getAttribute("fullname");
	if (fullname != null)
		person = fullname.toString();
%>
Full name of author <%= id %>: <%= person %>!
</body>
</html>