package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
      
    	System.out.println("我被执行啦～～监视器对象创建后，肯定执行构造方法～～～～");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	 System.out.println("ServletContext对象被创建啦！");
   }
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 System.out.println("ServletContext对象被销毁啦！");
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
        System.out.println("ServletRequest对象被创建啦！");
    }
    public void requestDestroyed(ServletRequestEvent sre)  { 
        System.out.println("ServletRequest对象被销毁啦！");
    }

    
    public void sessionCreated(HttpSessionEvent se)  { 
       System.out.println("ServletSession对象被创建啦！");
   }
	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("ServletSession对象被销毁啦！");
    }
	
}

