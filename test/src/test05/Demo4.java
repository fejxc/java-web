package test05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo4
 */
//@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		HttpSession session = request.getSession(); //获取Session
		session.setAttribute("user",user); //在session中设置user项
	

		out.print("您已登录，欢迎你，" + user.getUsername() + "！");
		out.print("<a href='/test/Demo5'>查看手机商品</a>");
		// 创建Cookie存放Session的标识号
		Cookie cookie = new Cookie("JSESSIONID",session.getId());
		cookie.setMaxAge(60 * 30);
		cookie.setPath("/test");
		response.addCookie(cookie);

		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
