package experiment07_02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmptyELServlet")
public class EmptyELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmptyELServlet() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List list = new ArrayList< >();
		List list2 = new ArrayList< >();
		List list3 = new ArrayList< >();
		list.add("11");
		
		request.getSession().setAttribute("list", list);
		request.getSession().setAttribute("list2", list2);
		request.getSession().setAttribute("list3", list3);
		request.getRequestDispatcher("/emptyEL.jsp").forward(request, response);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
