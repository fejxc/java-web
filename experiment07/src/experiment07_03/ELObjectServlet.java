package experiment07_03;

import java.io.IOException;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import org.apache.catalina.core.ApplicationContext;


@WebServlet("/ELObjectServlet")
public class ELObjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ELObjectServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("username", "Request"); //request
		request.getSession().setAttribute("username", "Session"); //session
		ServletContext servletContext = request.getServletContext(); 
		servletContext.setAttribute("username", "applicationContext"); //applicationcontext	
		request.getRequestDispatcher("/ELObject.jsp").forward(request, response);
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
