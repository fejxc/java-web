package saaemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {

	public static void main(String[] args) {
		
		String Path = "saaemble/beans5.xml";
		
		//加载文件配置
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
		//构造方式结果输出
		System.out.println(applicationContext.getBean("user1"));
		//设置方式输出
		System.out.println(applicationContext.getBean("user2"));
		
		
		
		
	}

}
