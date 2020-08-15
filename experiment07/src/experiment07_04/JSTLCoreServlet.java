package experiment07_04;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet("/JSTLCoreServlet")
public class JSTLCoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public JSTLCoreServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Order> orderlist = new ArrayList<>();
		Order orders1 = new Order();
		orders1.setId("0051");
		orders1.setAddress("北京昌平");
		orders1.setPhone("13785594487");
		Order orders2=new Order();
		orders2.setId("0052");
		orders2.setAddress("江西上饶");
		orders2.setPhone("18720328626");
		Order orders3=new Order();
		orders3.setId("0053");
		orders3.setAddress("江西上饶");
		orders3.setPhone("18720328888");
		request.setAttribute("username", "张三");
		orderlist.add(orders1);
		orderlist.add(orders2);
		orderlist.add(orders3);
		request.setAttribute("order", orderlist);
		request.getRequestDispatcher("/JSPCore.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
