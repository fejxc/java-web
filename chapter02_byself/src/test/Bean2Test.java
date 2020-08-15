package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path = "test/beans2.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
		
		Bean2 bean = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean);
	}

}
