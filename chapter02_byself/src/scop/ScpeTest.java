package scop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScpeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 从src开始算
		String Path = "scop/beans4.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
		System.out.println(applicationContext.getBean("scop"));
		System.out.println(applicationContext.getBean("scop"));
	}

}
