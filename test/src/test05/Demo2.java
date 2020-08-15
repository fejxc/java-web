package test05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo2
 */
//@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String token = (new Date()).getTime()+"";//获得当前时间随机数
		HttpSession session = request.getSession();   //在服务器端保存随机数
		session.setAttribute("num", token);
		//产生表单
		out.println("<form action='/test/Demo3' method='post'>");
		out.println("<input type='hidden' name='token' value='" + token + "'/>");//通过隐藏字段带一个随机数给服务器
		out.println("用户名：<input type='text' name='username'/>");
		out.println("<input type='submit' value='提交'/>");
		out.println("</form>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
