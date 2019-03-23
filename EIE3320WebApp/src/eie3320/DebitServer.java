package eie3320;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DebitServer
 */
@WebServlet("/DebitServer")
public class DebitServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String amount = "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DebitServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			amount = request.getParameter("Amount");
			setAttributes(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/CheckBalanceServlet");
			rd.forward(request,response);
			System.out.println(amount);	
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}
	public void setAttributes(HttpServletRequest request,HttpServletResponse response){
		request.setAttribute("dif", amount);
	}


}
