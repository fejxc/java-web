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
 * Servlet implementation class Demo3
 */
//@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo3() {
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		try {
			Thread.sleep(2000);//模拟服务器处理数据时间
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean b = isToken(request); //
		if(b == false) {
			out.write("请不要重复提交！");
			return;
		}
		//处理提交请求之前，需要先将session中保存的随机数移除掉
		request.getSession().invalidate();	
		out.write("处理用户提交请求成功！");
	}

	private boolean isToken(HttpServletRequest request) {		
		String clientToken = request.getParameter("token");//客户端token
		if(clientToken == null)
			return false;
		HttpSession session = request.getSession();
		String serverToken = (String)session.getAttribute("num"); //服务器端token
		if(serverToken == null)//如果已经提交过一次了，服务器会把随机数移除掉，serverToken就变成null了
			return false;		
		if(!clientToken.equals(serverToken))
			return false;	
		return true;
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
