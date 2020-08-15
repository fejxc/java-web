package Static_Factory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanscTest2 {

	public static void main(String[] args) {
			String Path = "Static_Factory/beans2.xml";
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
			
			Bean2 bean = (Bean2) applicationContext.getBean("bean2");
			System.out.println(bean);

	}

}
