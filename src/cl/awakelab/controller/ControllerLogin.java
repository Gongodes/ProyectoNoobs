package cl.awakelab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/ControllerLogin")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String d_usr = "admin";
		String d_pdw = "1234";
		
		if (d_usr.equals(request.getParameter("rut")) &&  d_pdw.equals(request.getParameter("password"))) {
			System.out.println("Usuario autenticado... creando sesion");
			 
			HttpSession sesion = request.getSession(true);
			 
			sesion.setAttribute("rut", request.getParameter("rut"));
			
			getServletContext().getRequestDispatcher("/ControllerForo").forward(request, response);
			
		} else {
			
			System.out.println("RUT no existe: usr:" +  request.getParameter("usr") + " pwd: " + request.getParameter("pwd"));
			getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
		}
	}

	}


