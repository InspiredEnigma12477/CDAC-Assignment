package pages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FrontController
 */
@WebServlet("/")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println("in F.C " + cmd);
		String outcome = null;
		if (cmd == null)
			outcome = "login.jsp";
		else if (cmd.equals("login"))
			outcome = "validate";
		System.out.println("outcome "+outcome);
		RequestDispatcher rd = 
				request.getRequestDispatcher(outcome);
		if (rd != null)
			rd.forward(request, response);

	}

}
