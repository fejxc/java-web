package test05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo5
 */
//@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		User user=null;
		try {
			Thread.sleep(1000);
			//以秒为单位，即在没有活动30分钟后，session将失效
			session.setMaxInactiveInterval(30*60);// 模拟session超时失效
			String username =(String) session.getAttribute("username");//从Session中获取user对象
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("异常:"+e.getMessage());
		} finally {
			if (user == null) {
				response.getWriter().print(
						"您还没有登录，请<a href='/test/login.html'>登录</a>");
			} else {
				out.print("苹果7手机：5555元");
			}
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
