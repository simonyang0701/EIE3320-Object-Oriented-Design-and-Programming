<html>
<head>
<title>Book Info.</title>
</head>
<body>

	<%@page import="java.util.ArrayList" %>
	<%@page import="java.util.Date" %>
	<%@page import="bookstore.*" %>
	<%
		ArrayList<Book> books = (ArrayList<Book>)session.getAttribute("foundBooks");
		int numBooks = books.size();
	%>
	Student Name: Yang Tianyu<br>
	Student ID: 13102841D<br><br>
	<center>The time now is: <%= new Date() %></center>
	
	<table align="center" border=1  >
	<tr>
		<th>ISBN</th>
		<th>Title</th>
		<th>Author</th>
		<th>Edition Number</th>
		<th>Publisher</th>
		<th>Copyright</th>
		<th></th>
	</tr>

	<% for (int i=0; i<numBooks; i++) { %>
	<tr>
		<!-- For each i, retrieve the information of the i-th book from the ArrayList. -->
		<!-- Display the information in one row per book. -->
		<!-- The last element of each row should contain a link to OrderServlet.class --> 
		<!-- with input parameter "selectedBook" and value equal to i -->
		<!-- Put your code here -->
		<th><% out.print(books.get(i).getIsbn()); %></th>
		<th><% out.print(books.get(i).getTitle()); %></th>
		<th><% out.print(books.get(i).getAuthor()); %></th>
		<th><% out.print(books.get(i).getEdition()); %></th>
		<th><% out.print(books.get(i).getPublisher()); %></th>
		<th><% out.print(books.get(i).getCopyright()); %></th>
		<th><a href="OrderServlet?selectedBook=<%=i%>">Add to Chart</a></th>
	</tr>
	<% } %>
</table>
<center><A href="SearchBook.html">Home</A></center>
</body>
</html>