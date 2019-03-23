package bookstore;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReceiptServlet
 */
@WebServlet("/ReceiptServlet")
public class ReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Get the customer name that the user inputs in the check-out.jsp
		// Get a PrintWriter object and set content type to "text/html"
		
		/*
		 * Assume perform credit card transaction here
		 */
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String customerName = request.getParameter("customerName");
		// Print transaction info and foward to SearchBook.html after 5 seconds
		// Note that it is better to implement the following part in another JSP. 
		// It is put here because the information is simple enough to be displayed by a servlet.
		
		String outStr = "";
		outStr += "Dear " + customerName + " , thanks for purchasing books from BookStore<br>\n";
		outStr += "This page will be automatically go back to SearchBook.html<br>\n";
		outStr += "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><br>\n";
		outStr += "<meta http-equiv=\"Refresh\" content=\"5; url=SearchBook.html\"><br>\n";
		out.print(outStr);
		out.close();		
	}

}
