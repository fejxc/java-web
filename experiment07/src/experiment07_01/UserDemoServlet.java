package experiment07_01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/UserDemoServlet")
public class UserDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserDemoServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			System.out.println(user);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
