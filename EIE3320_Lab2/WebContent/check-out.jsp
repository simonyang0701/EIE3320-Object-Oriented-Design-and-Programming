<html>
<head>
<title>Check Out</title>
</head>
<body>
<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>

	<%
		// Get the ShoppingCart object through the session object.
		// Put your code here
		ShoppingCart cart =(ShoppingCart)session.getAttribute("bookstore.cart");
		int numBooks = cart.size();
		// Compute the total price of all books in the shopping cart
		double sum = 0;
		for(int i=0;i<numBooks;i++){
			sum+=cart.get(i).getPrice();
		}
		double total = sum/* Put your code here */;
	%>
	Your total purchase is: <%=total %> <p></p>
	To purchase the item in your shopping cart, please provide us the following information:
	
	<form name="checkout" method="post" action="ReceiptServlet">
	<b>Name: </b> <input type="text" name="customerName" size=20 value="YANG Tianyu"><br>
	<b>Credit Card Number</b><input type="text" name="cardNumber" size=16 value="13102841D"> <br>
	<input type="submit" value="Submit Information"> &nbsp; &nbsp; 
	<input type="button" value="Cancel" onClick="JavaScript:window.location='show-order.jsp';">
	</form>	
	
</body>
</html>