

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String outStr = "";
		try{
			int NumberB = 1+(int)(Math.random()*5);
			session.setAttribute("nb", NumberB);
			String tmp = request.getParameter("guess");
			int NumberA = Integer.parseInt(tmp);
			if(NumberA>NumberB){
				outStr += "Your guess is too big!";
				outStr +="<br>\n<input type=button value=\"Guess again\" onClick=\"JavaScript:window.location='GuessNo.html';\">";
				out.print(outStr);
				out.close();
			}
			if(NumberA<NumberB){
				outStr += "Your guess is too small!";
				outStr +="<br>\n<input type=button value=\"Guess again\" onClick=\"JavaScript:window.location='GuessNo.html';\">";
				out.print(outStr);
				out.close();
			}
			if(NumberA == NumberB){
				ServletContext context = getServletContext();
				RequestDispatcher dispatcher = context.getRequestDispatcher("/ShowWin.jsp");
				dispatcher.forward(request, response);	
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
