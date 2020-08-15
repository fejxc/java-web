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
 * Servlet implementation class Demo1
 */
//@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//查询所有cookie信息
		Cookie[] cookies =request.getCookies() ;
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++ ){
				String name = cookies[i].getName();
				if(name.equals("product")){
					out.println("您上次浏览商品为：" + cookies[i].getValue());
					break;
				}
			}
		}else{
			out.println("No cookie.");
			Cookie cookie=new Cookie("product" , "IPhone7");
			cookie.setMaxAge(60*60);
			//发送cokkie
			response.addCookie(cookie);
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
