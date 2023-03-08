package pages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.CustomerBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			// get HttpSession
			HttpSession hs = request.getSession();

			// get bean from HS
			CustomerBean ref = (CustomerBean) hs.getAttribute("cust");
			// call setters
			ref.setEmail(request.getParameter("email"));
			ref.setPass(request.getParameter("pass"));
			// call B.L
			String outcome = ref.validateUser();
			// as per outcome ---forward user to suitable view
			RequestDispatcher rd = request.getRequestDispatcher(outcome
					.concat(".jsp"));
			if(rd != null)
				rd.forward(request,response);
		} catch (Exception e) {
			throw new ServletException("err in do-get", e);
		}
	}

}
