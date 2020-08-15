package tese02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CharacterFilter
 */
@WebFilter("/CharacterFilter")
public class CharacterFilter implements Filter {

   
    public CharacterFilter() {
  
    }

	
	public void destroy() {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		//拦截所有请求，解决全战中文乱码问题
		//指定request ，response的编码
		req.setCharacterEncoding("utf-8"); //post方法有效，对消息体有效
		resp.setContentType("text/html;charset=utf-8");
		
		//对req进行包装 加强getParameter方法
//		CharacterRequest cahracterReq = new CharacterRequest(req);
//		chain.doFilter(cahracterReq, response);
		chain.doFilter(request, response);
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
//加强getParameter方法
	class CharacterRequest extends HttpServletRequestWrapper{
		private HttpServletRequest request;
			public CharacterRequest(HttpServletRequest request) {
				super(request);
				this.request = request;
			}
	public String getParameter (String name) {
		String value = super.getParameter(name);
		if(value==null) {
			return null;
		}
		String method = super.getMethod();
		//判断请求方式
		if("get".equalsIgnoreCase(method)) {
			try {
				value = new String(value.getBytes("iso-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
		
	}
