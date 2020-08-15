package test05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo6
 */
//@WebServlet("/Demo6")
public class Demo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//首次遍历用户登陆信息，查看是否存储有自动登陆相关信息
		Cookie[] cookies = request.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			if(cookies[i].getName().equals("username")){
				cookies[i].setMaxAge(5);
				response.addCookie(cookies[i]);
				
				out.print("您已登录，欢迎你！");
				out.print("<a href='/test/login2.html'>退出</a>");
				return;
			}
		}
		//用户收集用户登陆信息
		String username = request.getParameter("username");
		String autoLogin = request.getParameter("autoLogin");
		if(username.trim().equals("") || username==null){
			out.print("请输入用户名登陆");
			response.setHeader("refresh","2;URL=/test/login2.html");//2秒后刷新跳转到登陆页面
			return;
		}
		//表示用户使用自动登陆功能
		if("autoLogin"!=null){
			Cookie cookie = new Cookie("username",username);//创建新cookie
			cookie.setMaxAge(5);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
		out.print("您已登录，欢迎你！");
		out.print("<a href='/test/login2.html'>退出</a>");
		return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
