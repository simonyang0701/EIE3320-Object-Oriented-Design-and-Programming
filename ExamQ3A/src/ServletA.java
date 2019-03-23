

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletA
 */
@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session == null)
		{
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UserQuery.html");
			dispatcher.forward(request, response);
			return;
		}
		else{
			String name = (String) request.getParameter("name");
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta heep-equiv=\"Refresh\" content=\"5; url=ServletA\">");
			out.println("</head>");
			out.println("<body>");
			out.println("Hello "+name+",again!");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
