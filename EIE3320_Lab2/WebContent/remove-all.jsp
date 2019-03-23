<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Remove All Items</title>
</head>
<body>
<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>

	<%
		// Get the ShoppingCart object through the session object
		// Put your code here
		ShoppingCart cart =(ShoppingCart)session.getAttribute("bookstore.cart");
		// Remove all books in the shopping cart
		// Put your code here
		cart = new ShoppingCart();
		session.setAttribute("bookstore.cart",cart);

	%>
	<jsp:forward page="show-order.jsp"/>

</body>
</html>